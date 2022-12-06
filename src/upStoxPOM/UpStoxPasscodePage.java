package upStoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpStoxPasscodePage {
	
	//variable declaration
	@FindBy(id="yob") private WebElement passCode;
	
	
	//variable Initialization-through constructor
	public UpStoxPasscodePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//variable Usage
	public void enterPasscode(String pCode)
	{
		passCode.sendKeys(pCode);
	}
	
	
	

}
