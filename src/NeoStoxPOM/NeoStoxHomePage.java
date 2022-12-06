package NeoStoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import NeoStoxUtility.NeoUtility;

public class NeoStoxHomePage {
	
	@FindBy(id="lbl_curbalancetop") private WebElement fundValue;
	//@FindBy(xpath="(//span[@class='righttopmenu1'])[2]")private WebElement 
	@FindBy(id="lbl_username") private WebElement userName;
	
	
	public NeoStoxHomePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public  String takeUserName(WebDriver driver)
	{
		NeoUtility.scollToElement(driver, userName);
		String name=userName.getText();
		Reporter.log("Get UserName" +name ,true);
		return name;
	}
	


}
