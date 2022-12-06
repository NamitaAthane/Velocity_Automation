package NeoStoxPOM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import NeoStoxUtility.NeoUtility;

public class NeoStoxLogin {
	
	@FindBy(xpath="//input[@aria-label='mobilenumber']") private WebElement mobileNumber;
	@FindBy(id="lnk_signup1")private WebElement signIn;
	
	
	public NeoStoxLogin(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
		
	}
	
	public void sendMobileNumber(WebDriver driver, String key) throws IOException
	{
		mobileNumber.sendKeys(NeoUtility.readPropertyFileData(key));
		Reporter.log("Sending Mobile Number",true);	
	}

	public void signIntoLoginPage(WebDriver driver)
	{
		NeoUtility.ImplicitWaitCall(driver, 1000);
		signIn.click();
		Reporter.log("Click on sign in",true);
	}
}
