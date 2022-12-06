package upStoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpStoxWelcomePage {
	
	//Variable Declaration
	
	@FindBy(xpath="(//button[@type='button'])[9]") private WebElement button;

	//variable initialization
	
	public UpStoxWelcomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Variable Usage
	public void clickOnWelcomePage()
	{
		
		button.click();
	}
	
}
