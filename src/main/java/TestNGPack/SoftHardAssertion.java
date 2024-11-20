package TestNGPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class SoftHardAssertion {
	
	
	 static WebDriver driver=new ChromeDriver();  
    public static void main(String[] args) {
    	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");  
         
         // Launch Website  
//    	 driver.get("https://practicetestautomation.com/practice-test-login/");
//
//    	 driver.findElement(By.id("username")).sendKeys("student");
//    	 driver.findElement(By.name("password")).sendKeys("Password123");
//    	 driver.findElement(By.cssSelector("button#submit")).click();
////
////    	 String expectedUrl = "https://practicetestautomation.com/logged-in-successfully/";
////    	 String actualUrl = driver.getCurrentUrl();
////    	 Assert.assertEquals(actualUrl, expectedUrl, "Actual page url is not the same as expected");
////
////    	 WebElement successMessage = driver.findElement(By.tagName("strong"));
////    	 String expectedMessage = "Congratulations Michael Scott. You successfully logged in!";
////    	 String actualMessage = successMessage.getText();
////    	 Assert.assertTrue(actualMessage.contains(expectedMessage), "Actual message does not contain expected message.\nActual Message: " + actualMessage + "\nExpected Message: " + expectedMessage);
////
//////    	 WebElement logOutButton = driver.findElement(By.linkText("Log out"));
//////    	 Assert.assertTrue(logOutButton.isDisplayed(), "Log Out button is not visible");
    	 SoftAssert softAssert = new SoftAssert();
    	 
    	 driver.get("https://practicetestautomation.com/practice-test-login/");

    	 driver.findElement(By.id("username")).sendKeys("student");
    	 driver.findElement(By.name("password")).sendKeys("Password123");
    	 driver.findElement(By.cssSelector("button#submit")).click();


    	 String expectedUrl = "https://practicetestautomation.com/logged-in-successfully/";
    	 String actualUrl = driver.getCurrentUrl();
    	 softAssert.assertEquals(actualUrl, expectedUrl, "Actual page url is not the same as expected");

    	 WebElement successMessage = driver.findElement(By.tagName("strong"));
    	 String expectedMessage = "Congratulations Michael Scott. You successfully logged in!";
    	 String actualMessage = successMessage.getText();

    	 softAssert.assertTrue(actualMessage.contains(expectedMessage), "Actual message does not contain expected message.\nActual Message: " + actualMessage + "\nExpected Message: " + expectedMessage);
    	 WebElement logOutButton = driver.findElement(By.linkText("Log out"));
    	 softAssert.assertTrue(logOutButton.isDisplayed(), "Log Out button is not visible");

    	 softAssert.assertAll();
        
    }
		
		 
		  

}
