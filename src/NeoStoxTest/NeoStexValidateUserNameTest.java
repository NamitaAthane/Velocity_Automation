package NeoStoxTest;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import NeoStoxBase.Base;
import NeoStoxPOM.NeoStoxHomePage;
import NeoStoxPOM.NeoStoxLogin;
import NeoStoxPOM.NeoStoxPassword;
import NeoStoxPOM.NeoStoxWelcomePage;
import NeoStoxUtility.NeoUtility;

@Listeners(NeoStoxBase.ListnerScreenshot.class)

public class NeoStexValidateUserNameTest extends Base {
	
	NeoStoxLogin loginPage;
	NeoStoxPassword password;
	NeoStoxWelcomePage welcome;
	NeoStoxHomePage homePage;
	String TCID;
	
	@BeforeClass
	public void openBroswer()
	{
		launchBrowser();
		loginPage=new NeoStoxLogin(driver);	
		password=new NeoStoxPassword(driver);
		welcome=new NeoStoxWelcomePage(driver);
		homePage=new NeoStoxHomePage(driver);
		
	}
	@BeforeMethod
	public void logintoNewStox() throws IOException, InterruptedException
	{
		loginPage.sendMobileNumber(driver, "Phoneno");
		loginPage.signIntoLoginPage(driver);
		password.enterPassword(driver, "Passcode");
		password.submit(driver);
		Thread.sleep(2000);
		welcome.closeImpInfoPage(driver);
		Thread.sleep(2000);
		welcome.closeWelcomePage(driver);
		
	}
	
	 @Test
  public void validateUserName() throws IOException {
		 
		 String userName=homePage.takeUserName(driver);
		 Assert.assertEquals(userName, NeoUtility.readPropertyFileData("Username"),"User name is not matched");
		 Reporter.log("User Name value is matched",true);
		 NeoUtility.takeScreenshot(driver,userName);
		 
		 
  }
}
