package TestNG_POM_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CrossBrower {
  WebDriver driver;
  
  @BeforeMethod
   public void chromeDriver()
   {
	   driver=new ChromeDriver();
	   driver.get("https://google.com"); 
   }
  @BeforeMethod
   public void  fireFox()
   {
	   driver=new FirefoxDriver();
	  
	   driver.get("https://amazon.in");
	  }
  @Test
  public void f()
  { 
	  System.out.println("The title of the page: "+driver.getTitle());  
  }
}
