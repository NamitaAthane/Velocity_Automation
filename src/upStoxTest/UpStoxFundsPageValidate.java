package upStoxTest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import upStoxBase.Base;
import upStoxPOM.UpStoxFundsPage;
import upStoxPOM.UpStoxHomePage;
import upStoxPOM.UpStoxLoginPage;
import upStoxPOM.UpStoxPasscodePage;
import upStoxPOM.UpStoxWelcomePage;
import upStoxUtility.Utility;

public class UpStoxFundsPageValidate extends Base {

	  UpStoxHomePage homePage;
	  UpStoxLoginPage loginPage;
	  UpStoxPasscodePage passCode;
	  UpStoxWelcomePage welcomePage;
	  UpStoxFundsPage fundPage;
	  String TCId="Fund341";
	  
	  
	  @BeforeClass
	  public void OpenBrowser()
	  {
		
		  launchBroswer();
		  homePage=new UpStoxHomePage(driver);
		  loginPage=new UpStoxLoginPage(driver);
		  passCode=new UpStoxPasscodePage(driver);
		  welcomePage=new UpStoxWelcomePage(driver);
		  fundPage=new UpStoxFundsPage(driver);		  
	  }
	  
	  @BeforeMethod
	  public void loginToUpsox() throws EncryptedDocumentException, IOException
	  {
		 loginPage.enterUserId(Utility.readDatafromExcel(0, 0));
		 loginPage.enterPassword(Utility.readDatafromExcel(0, 1));
		 Reporter.log("Entering UserId and Password", true);
	 loginPage.clickOnsignOnButton();
		 Reporter.log("Click onsign on Button",true);
		 Utility.wait(driver, 500);
		 passCode.enterPasscode(Utility.readDatafromExcel(0, 2));
		 Reporter.log("Entering Password",true);
		 Utility.wait(driver, 7000);
		 welcomePage.clickOnWelcomePage();
		 Reporter.log("Welcome Page clicked",true);
		 
	  }
	  
	   
	  @Test
	  public void ValidatFund() throws IOException
	  {
		  homePage.clickOnFundOption();
		 String fundvalue=fundPage.getFundvalue();
		 Utility.wait(driver, 500);
		 Assert.assertNotNull(fundvalue);
		 
		 Reporter.log("Fund value is" +fundvalue +true);
		 Utility.screenShot(driver,TCId);
		 		  
	  }
	  
	  @AfterMethod
	  public void logOutPage()
	  {
		  Utility.wait(driver, 500);
		  homePage.logOut(driver);
	
	  }
	  
	  @AfterClass
	  public void closeBrowser()
	  {
		  Utility.wait(driver, 500);
		  driver.close();
	 
	  
  }
}


