package AllTestNGPack;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class suiteParameterExample {
	
    @BeforeSuite
    @Parameters({ "browser", "environment" })
    public void setupSuite(String browser, String environment) {
        System.out.println("Suite Setup - Browser: " + browser + ", Environment: " + environment);
        // Additional setup logic for the suite
    }

    @Test
    @Parameters({ "username", "password" })
    public void testMethod(String username, String password) {
        System.out.println("Suite Setup - username: " + username + ", password: " + password);
        // Test logic goes here
    }

}
