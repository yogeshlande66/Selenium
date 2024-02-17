package TestNG_POM_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login_google {
	
	WebDriver driver;
	
	
	@BeforeMethod
	public void SetUp()
	{
		driver=new ChromeDriver();
		
	  driver.get("https://google.com");
	}
	
@AfterMethod
	
	public void getTitle()
	{
		driver.quit();
	}
  @Test
  public void f() {
	  
	String titile=driver.getTitle();
	
	System.out.println(titile);
	
	 
  }
}
