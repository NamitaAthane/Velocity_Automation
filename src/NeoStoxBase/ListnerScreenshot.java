package NeoStoxBase;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import NeoStoxUtility.NeoUtility;
import upStoxUtility.Utility;

public class ListnerScreenshot extends Base implements ITestListener {
	
	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Test Case  " +result.getName() +" Passed Successfully",true);
	}
	
	
	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("Test Case " +result.getName() +" Failed",true);
		try {
			NeoUtility.takeScreenshot(driver, result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
