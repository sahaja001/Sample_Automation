package AllTestNGPack;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class suiteLevelConfig {
	   @BeforeSuite
	    public void beforeSuiteSetup() {
	        // Perform setup steps before the suite
	        System.out.println("BeforeSuite: Setting up the suite");
	    }

	    @AfterSuite
	    public void afterSuiteTeardown() {
	        // Perform teardown steps after the suite
	        System.out.println("AfterSuite: Tearing down the suite");
	    }

}
