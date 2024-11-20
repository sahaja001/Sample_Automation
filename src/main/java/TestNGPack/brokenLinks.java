package TestNGPack;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenLinks {
	
	 public static void main(String[] args) throws IOException {
		 WebDriver driver = new ChromeDriver();

		 // Initialize Webdriver Object (Update your system's path)
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		 
		 driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");

		 // Store all link elements (anchor tag elements in html) in a list
		 List<WebElement> links = driver.findElements(By.tagName("a"));

	        HttpClient client = HttpClient.newHttpClient();

	        // Check each link for validity
	        for (WebElement link : links) {
	            String linkUrl = link.getAttribute("href");
	            System.out.println(linkUrl);
	            if (linkUrl != null && !linkUrl.isEmpty()) {
	                // Check if the link is valid
	                checkLinkStatus(client, linkUrl);
	            }
	        }

	        // Close the driver
	        driver.quit();
	    
		 
		 		
	 }
	 
	 private static void checkLinkStatus(HttpClient client, String linkUrl) {
	        try {
	            // Create a HttpRequest from the URL
	            HttpRequest request = HttpRequest.newBuilder()
	                    .uri(URI.create(linkUrl))
	                    .build();

	            // Send the request and get the response
	            HttpResponse<Void> response = client.send(request, HttpResponse.BodyHandlers.discarding());

	            // Get the status code
	            int responseCode = response.statusCode();

	            // Check if the response code indicates a broken link
	            if (responseCode != 200) {
	                System.out.println("Broken link: " + linkUrl + " (Status code: " + responseCode + ")");
	            } else {
	                System.out.println("Valid link: " + linkUrl);
	            }
	        } catch (IOException | InterruptedException e) {
	            // Handle errors (e.g., malformed URL, timeout)
	            System.out.println("Error with link: " + linkUrl + " - " + e.getMessage());
	        }
	    }
	}