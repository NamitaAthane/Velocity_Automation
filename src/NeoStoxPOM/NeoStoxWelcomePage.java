package NeoStoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import NeoStoxUtility.NeoUtility;

public class NeoStoxWelcomePage {
	@FindBy(xpath="(//a[text()='Close'])[5]") private WebElement closeOption;
	@FindBy(xpath="(//a[text()='OK'])[2]") private WebElement okOption;
	
	public NeoStoxWelcomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void closeImpInfoPage(WebDriver driver)
	
	{
		NeoUtility.ImplicitWaitCall(driver, 100000);
		NeoUtility.ExplicitWait(driver, okOption);
		okOption.click();
		Reporter.log("Click on Ok option", true);
		
	}
	
public void closeWelcomePage(WebDriver driver)
	
	{
		NeoUtility.ImplicitWaitCall(driver, 100000);
		NeoUtility.ExplicitWait(driver, closeOption);
		closeOption.click();
		Reporter.log("Click Close option", true);
		
	}

}
