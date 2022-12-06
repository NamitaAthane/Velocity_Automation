package upStoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpStoxFundsPage {
	
	@FindBy(xpath="((//div[@class='_2Bthrplw1VYHfLzzQv0asZ'])[1]//div)[3]")private  WebElement availableFunds;
	

	public UpStoxFundsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String getFundvalue()
	{
		String fundValue=availableFunds.getText();
		return fundValue;
	}
}
