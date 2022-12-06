package upStoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpStoxLoginPage {
	
	//Variable declaration
	@FindBy(name="userId") private WebElement userId;
	@FindBy(name="password")private WebElement passWord;
	@FindBy(xpath="//button[@id='submit-btn']")private WebElement submitButton;
	
	//Variable Initialization
	public UpStoxLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//Variable usage
	public void enterUserId(String username)
	{
		userId.sendKeys(username);
	}
	public void enterPassword(String pwd)
	{
		passWord.sendKeys(pwd);
	}
	
	public void clickOnsignOnButton()
	{
		submitButton.click();
	}
	
	
	
	
	

}
