package Test_Scanrio;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Objec.Google_Page;


public class GoogleTest{
	WebDriver driver;
	Google_Page page;
 @BeforeTest
 public void get()
 {
	 driver=new ChromeDriver();
	 driver.get("https://Google.com");
	 driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	 
	  
 }
 @Test
 public void  Result()
 {
	page=new Google_Page(driver);
    page.SearchPage("Facebook");
}

 @AfterMethod
  public void end()
  {
	 driver.quit();
	 
  }
}
