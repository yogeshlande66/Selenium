import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class Extent_Reports {
	
	
	
	WebDriver driver;
	
	
	@BeforeClass
	public void  SetUp()
	{
		
		driver=new ChromeDriver();
		Reporter.log("Chrome Browser got launched");
		
		driver.manage().window().maximize();
		Reporter.log("chrome browser is maximize ");

		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		}
	
@Test
public void demo1() 
{
 driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	Reporter.log("url of the application is opned");
 WebElement username= driver.findElement(By.xpath("//input[@id='input-email']"));
 username.sendKeys("fgfdhfhdhhdhdjdgj");
	Reporter.log("Username is entereds");

 WebElement pass=driver.findElement(By.xpath("//input[@id='input-password']"));
 pass.sendKeys("fhfhh");
 Reporter.log("password is entereds");
 WebElement button=driver.findElement(By.xpath("//input[@class='btn btn-primary']"));
 button.click();
 Reporter.log(" sucessfuly login");
  TakesScreenshot screenshot=(TakesScreenshot)driver;
   File file=screenshot.getScreenshotAs(OutputType.FILE);
	Reporter.log("<a href=\"C:\\Users\\ADMIN\\eclipse-workspace\\Selenium\\test.png\">screenshot</a>");

   try 
   {
	FileUtils.moveFile(file,new File("C:\\Users\\ADMIN\\eclipse-workspace\\Selenium\\test.png"));
  } 
   catch (IOException e) 
   {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
   
  
 
 //Assert.assertTrue(true,"Sucessfully page is login");

	
}
@AfterClass
public void  tearDown()
{
 driver.close();
}
	


	}
