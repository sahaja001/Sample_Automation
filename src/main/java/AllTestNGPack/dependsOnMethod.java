package AllTestNGPack;

import org.testng.annotations.Test;

public class dependsOnMethod {
	@Test(dependsOnMethods = {"openBrowser", "signIn"})
	  public void logOut() {
	    System.out.println("Logging out");
	  }
	
	 @Test
	  public void openBrowser() {
	    System.out.println("Opening the browser");
	  }

	  @Test(dependsOnMethods = "openBrowser")
	  public void signIn() {
	    System.out.println("Signing in");
	  }

	  

}
