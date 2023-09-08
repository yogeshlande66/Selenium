package TestNg;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import org.testng.annotations.Parameters;


public class Assert {
	WebDriver driver;
	
	@Test
	@Parameters({"browser","url"}) //Ans:   //problem:The attribute value is undefined for the annotation type Parameters" error is displayed for Cross-Browser Testing Script
  public void f(String browser,String app) {
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
			
	  //driver.get("https://google.com");
		}
	   driver.get(app); // Whatver the value is passed in the XML file, Which is used here after calling driver.get method

	}
  @Test
  public void logo(String browser,String app)
  {
	  if(browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
			
	  //driver.get("https://google.com");
	  
    
       driver.get(app);
	  WebElement  logo=driver.findElement(By.xpath("//img[@alt='Google']"));
	  org.testng.Assert.assertTrue(logo.isDisplayed(),"Logo is not displayed");	 
     
		}
   	 
  }
  @Test
  public void PageTitle(String browser, String app)
  {
	  if(browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
			
	  //driver.get("https://google.com");
      driver.get(app);
	  String page=driver.getTitle();
	 String act="Google";
	org.testng.Assert.assertTrue(act.equals(act),page);
	
	// driver.close();
	 
  }
  
  }
 
}
  
  
 
