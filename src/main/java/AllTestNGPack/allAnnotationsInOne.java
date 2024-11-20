package AllTestNGPack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class allAnnotationsInOne {
    @BeforeMethod
    public void beforeMethodSetup() {
        // Perform setup steps before each test method
        System.out.println("BeforeMethod: Setting up the method");
    }

    @AfterMethod
    public void afterMethodTeardown() {
        // Perform teardown steps after each test method
        System.out.println("AfterMethod: Tearing down the method");
    }
	
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
		    
		    @Test
		    public void test1() {
		        // Perform teardown steps after each test
		        System.out.println("this is test1");
		    }
		    @Test
		    public void test2() {
		        // Perform teardown steps after each test
		        System.out.println("this is test2");
		    }

}
