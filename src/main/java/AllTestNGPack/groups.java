package AllTestNGPack;

import org.testng.annotations.Test;

public class groups {

	  @Test(groups = "smoke")
	  public void smokeTest1() {
	    System.out.println("Executing smoke test 1");
	  }

	  @Test(groups = "smoke")
	  public void smokeTest2() {
	    System.out.println("Executing smoke test 2");
	  }

	  @Test(groups = "regression")
	  public void regressionTest1() {
	    System.out.println("Executing regression test 1");
	  }

	  @Test(groups = {"regression", "sanity","smoke"})
	  public void regressionAndSanityTest() {
	    System.out.println("Executing regression and sanity test");
	  }
	}


