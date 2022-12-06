package NeoStoxBase;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listner implements ITestListener {
	
	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Test Case  " +result.getName() +" Passed Successfully",true);
	}
	
	
	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("Test Case " +result.getName() +" Failed",true);
	}

}
