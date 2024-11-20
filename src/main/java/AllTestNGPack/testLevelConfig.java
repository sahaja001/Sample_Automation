package AllTestNGPack;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class testLevelConfig {
	   @BeforeTest
	    public void beforeTestSetup() {
	        // Perform setup steps before each test
	        System.out.println("BeforeTest: Setting up the test");
	    }

	    @AfterTest
	    public void afterTestTeardown() {
	        // Perform teardown steps after each test
	        System.out.println("AfterTest: Tearing down the test");
	    }

}
