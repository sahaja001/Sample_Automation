package sampleProject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Pattern;

public class SystemHelper {
	public SystemHelper() {
        super();
    }

	public static void main(String[] args) throws IOException {
		System.out.println(makeSlug("Hello World! This is a Test... @2024"));
		System.out.println(readFile("C:\\Users\\Admin\\Downloads\\test.txt"));
		createFolder("C:\\Users\\Admin\\Downloads\\sddf.txt");
		System.out.println(getCurrentDir());
		System.out.println(splitString("Maximum", "i"));

	}
	
	public static ArrayList<String> splitString(String str, String valueSplit) {
        ArrayList<String> arrayListString = new ArrayList<>();
        for (String s : str.split(valueSplit, 0)) {
            arrayListString.add(s);
        }
        return arrayListString;
    }
	  public static String getCurrentDir() {
	        String current = System.getProperty("user.dir") + File.separator;
	        return current;
	    }


	    private static final Pattern NONLATIN = Pattern.compile("[^\\w-]");
	    private static final Pattern WHITESPACE = Pattern.compile("[\\s]");

	    public static String makeSlug(String input) {
	        if (input == null)
	            throw new IllegalArgumentException();

	        String noWhiteSpace = WHITESPACE.matcher(input).replaceAll("_");
	        String normalized = Normalizer.normalize(noWhiteSpace, Normalizer.Form.NFD);
	        String slug = NONLATIN.matcher(normalized).replaceAll("");
	        return slug.toLowerCase(Locale.ENGLISH);
	        
	    }
	    public static String readFile(String file) throws IOException {
	        Charset cs = Charset.forName("UTF-8");
	        FileInputStream stream = new FileInputStream(file);
	        try {
	            Reader reader = new BufferedReader(new InputStreamReader(stream, cs));
	            StringBuilder builder = new StringBuilder();
	            char[] buffer = new char[8192];
	            int read;
	            while ((read = ((BufferedReader) reader).read(buffer, 0, buffer.length)) > 0) {
	                builder.append(buffer, 0, read);
	            }
	            return builder.toString();
	        } finally {
	            stream.close();
	        }
	    }
	    public static void createFolder(String path) {
	        // File is a class inside java.io package
	        File file = new File(path);

	        String result = null;

//	        int lengthSum = path.length();
//	        int lengthSub = path.substring(0, path.lastIndexOf('/')).length();

//	        result = path.substring(lengthSub, lengthSum);

	        if (!file.exists()) {
	            file.mkdir();  // mkdir is used to create folder
	            System.out.println("Folder " + file.getName() + " created: " + path);
	        } else {
	            System.out.println("Folder already created");
	        }
	    }

}