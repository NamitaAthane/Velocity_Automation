package NeoStoxPOM;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import NeoStoxUtility.NeoUtility;
import upStoxUtility.Utility;

public class NeoStoxPassword {
	
@FindBy(id="txt_accesspin") private WebElement password;
@FindBy(id="lnk_submitaccesspin")private WebElement submit;

public NeoStoxPassword(WebDriver driver)
{
PageFactory.initElements(driver, this);
}

public void enterPassword(WebDriver driver,String key) throws IOException

{
	NeoUtility.ImplicitWaitCall(driver, 2000);
	password.sendKeys(NeoUtility.readPropertyFileData(key));
	Reporter.log("Entering Passcode",true);
	
}

public void submit(WebDriver driver)

{
	NeoUtility.ImplicitWaitCall(driver,8000);
	NeoUtility.ExplicitWait(driver, submit);
	submit.click();
	Reporter.log("Click on submit button",true);
	
}

}
