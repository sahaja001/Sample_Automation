package AllTestNGPack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class classLevelConfig {
	
    @BeforeClass
    public void beforeClassSetup() {
        // Perform setup steps before the class
        System.out.println("BeforeClass: Setting up the class");
    }

    @AfterClass
    public void afterClassTeardown() {
        // Perform teardown steps after the class
        System.out.println("AfterClass: Tearing down the class");
    }


}
