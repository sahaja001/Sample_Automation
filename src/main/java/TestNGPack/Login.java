package TestNGPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Login {
	WebDriver driver;

    @Parameters({"Username","Password"})

    @Test()
    public void loginTest(String userName, String password) {

    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe"); 
                    driver = new ChromeDriver();

                    driver.manage().window().maximize();

                    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

                    driver.findElement(By.name("username")).sendKeys(userName);

                    driver.findElement(By.name("password")).sendKeys(password);

                    driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

    }

}
