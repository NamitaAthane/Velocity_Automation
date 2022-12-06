package upStoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import upStoxUtility.Utility;

public class UpStoxHomePage {
	@FindBy(xpath="(//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[2]") private WebElement userName;
	@FindBy(id="funds")private WebElement fund;
	@FindBy(id="logout")private WebElement logOut;
	
	public UpStoxHomePage(WebDriver driver)
	
	{
		PageFactory.initElements(driver, this);
	}
	
	public String getActualUserName(WebDriver driver)
	{
		Utility.ScrollIntoview(driver,userName);
		String actualUserName=userName.getText();
		return actualUserName;
		
	}
	
	public void clickOnFundOption()
	{
		fund.click();
	}
	
	public void logOut(WebDriver driver)
	
	{
		userName.click();
		Utility.wait(driver, 500);
		logOut.click();
	}
	
	
	
	
	

}
