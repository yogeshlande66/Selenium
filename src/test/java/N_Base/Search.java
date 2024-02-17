package N_Base;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.Search_Base;

public class Search {
	WebDriver driver;
	Search_Base b;
	@BeforeTest
	 public void ini()
	 {
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get("https://google.com/");
	 }
	@Test
	public void opration()
			{
 b=new Search_Base(driver);
b.Search("Facebook");	
//b.Title();


			}
	@AfterTest
	public void tearDown()
	{
		driver.quit();
		
	}
	

}
