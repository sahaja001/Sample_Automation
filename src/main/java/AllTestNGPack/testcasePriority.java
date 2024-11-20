package AllTestNGPack;

import org.testng.annotations.Test;

public class testcasePriority {
	@Test(enabled = false)
	  public void one() {
	    System.out.println("This is test case 1");
	  }
		
	
	  @Test(enabled = false)
	  public void two() {
	    System.out.println("This is test case 2");
	  }
	  
	  @Test(enabled = true)
	  public void abcd() {
	    System.out.println("This is test abcd");
	  }
	  
	  @Test(enabled = true)
	  public void abce() {
	    System.out.println("This is test abce");
	  }

	  @Test(priority = 1)
	  public void apple() {
	    System.out.println("This is test case 3");
	  }
	  @Test(priority = 1)
	  public void ball() {
	    System.out.println("This is test case oneminue");
	  }

	  @Test(priority = 3)
	  public void four() {
	    System.out.println("This is test case 4");
	  }

}
