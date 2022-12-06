package NeoStoxBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import NeoStoxUtility.NeoUtility;

public class Base {
	
	protected static WebDriver driver=null;
	
	public void launchBrowser() {
		
		System.setProperty("webdriver.chrome.driver","E:\\Nam_Software\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://neostox.com/sign-in");
		NeoUtility.ImplicitWaitCall(driver, 500);
		
	}

}