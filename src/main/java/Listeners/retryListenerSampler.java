package Listeners;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class retryListenerSampler {
	
	@Test()
	public void Test1()
	{
		Assert.assertEquals(false, true);
	}

	@Test
	public void Test2()
	{
		Assert.assertEquals(false, true);
	}

}
