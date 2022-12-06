package upStoxBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	protected WebDriver driver=null;// decalred globally so that it can be accessed it Test class also protected 
	//cause it can be access outside package through inheritance
	public void launchBroswer()
	{	
		System.setProperty("webdriver.chrome.driver","E:\\Nam_Software\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://login-v2.upstox.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

		
	}
	
	
	
	
	

}
