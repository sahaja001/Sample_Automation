package sampleProject;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class ExcelToHashtable {
	 
	public static void main(String args[]) {
		List<Hashtable<String, String>> testDataList = readExcelData("C:\\Users\\Admin\\Downloads\\testdata.xlsx", "STUDENT_DATA");
		 for (Hashtable<String, String> testData : testDataList) {
	            String Mobile = testData.get("Mobile");
	            String Gender = testData.get("Gender");
	            String email = testData.get("Email");
	        
	            
	            System.out.println(Mobile);
	            System.out.println(Gender);
	            System.out.println(email);
	        }
	}
    public static List<Hashtable<String, String>> readExcelData(String filePath, String sheetName) {
        List<Hashtable<String, String>> dataList = new ArrayList<>();
        
        try (FileInputStream fis = new FileInputStream(filePath);
             Workbook workbook = new XSSFWorkbook(fis)) {
             
            Sheet sheet = workbook.getSheet(sheetName);
            if (sheet == null) {
                System.out.println("Sheet not found!");
                return dataList;
            }

            // Read header row to get column names
            Row headerRow = sheet.getRow(0);
            
            String[] columnNames = new String[headerRow.getPhysicalNumberOfCells()];
            for (int i = 0; i < headerRow.getPhysicalNumberOfCells(); i++) {
                columnNames[i] = headerRow.getCell(i).getStringCellValue();
            }

            // Read data rows
            for (int rowIndex = 1; rowIndex <= sheet.getLastRowNum(); rowIndex++) {
                Row row = sheet.getRow(rowIndex);
                Hashtable<String, String> rowData = new Hashtable<>();
                
                for (int colIndex = 0; colIndex < columnNames.length; colIndex++) {
                    Cell cell = row.getCell(colIndex);
                    if (cell != null) {
                        rowData.put(columnNames[colIndex], cell.getStringCellValue());
                    }
                }
                
                dataList.add(rowData);
               
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(dataList);
        return dataList;
        
      
    }
    
    
}

