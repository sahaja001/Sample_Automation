package Listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class retryAnalyzer implements IRetryAnalyzer{

	int counter = 0;
	int retryLimit = 2;
	@Override
	public boolean retry(ITestResult result) {
		
		if(counter<retryLimit)
		{
			System.out.println("retring test case "+result.getName()+" "+counter);
			counter++;
			return true;
		}
		
		return false;
	}

}
