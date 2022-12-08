package NeoStoxUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class NeoUtility {
	
	//Method to read property value
	public static String  readPropertyFileData(String key) throws IOException
	{
		//create the object of Property file
		Properties prop=new Properties();
		
		//Give the path of fileInputStream
		FileInputStream  file= new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\BaseUtilityPOMTest\\NeoStoxProperty.properties");
		
		
		prop.load(file);//Load property file
		String value=prop.getProperty(key); //get key from property file
		Reporter.log("Entered value is : " +key ,true);
		return value;
				
	}
	
	
	//method to scroll
	public static void scollToElement(WebDriver driver,WebElement element)
	{
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView()", element);
		Reporter.log("Scroll to Element",true);
		
		
	}
	
	//method to take screen shot
	
//	public static void takeScreenshot(WebDriver driver,String TCID) throws IOException
//	{
//		TakesScreenshot ts = ((TakesScreenshot)driver);
//		
//		File src = ts.getScreenshotAs(OutputType.FILE);
//		
//		File dest=new File("E:\\Namita_learning\\V Learning\\screenshots"+TCID+".jpeg");
//		
//		FileHandler.copy(src, dest);
//		Reporter.log("Taking screen shot",true);
//		
//	}
	public static void takeScreenshot(WebDriver driver, String TCName) throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("E:\\Namita_learning\\V Learning\\screenshots\\" +TCName+".png");
		FileHandler.copy(src, dest);
		Reporter.log("Take ScreeenShot",true);
	}

	
	//Implicit wait
	
	public static void ImplicitWaitCall(WebDriver driver,int waitTime)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(waitTime));
		Reporter.log("WaitTime : "+waitTime ,true);
	}

	public static void ExplicitWait(WebDriver driver,WebElement element,int nam) {
		
		WebDriverWait wt=new WebDriverWait(driver,Duration.ofSeconds(5000));
		wt.until(ExpectedConditions.visibilityOf(element));
		
		}
}
