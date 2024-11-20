package AllTestNGPack;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class methodLevelConfig {
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

}
