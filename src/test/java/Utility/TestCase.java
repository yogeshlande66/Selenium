package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestCase extends  Utiity_class {
	WebDriver driver;
	Locator page;
	@Test
	public void StartAppli()
	{
	  driver=new ChromeDriver();
		Utiity_class.SatrtAppli(driver,"Chrome","https://www.facebook.com/");
	 System.out.println(driver.getTitle());
	}
	@Test
	public void loc()
	{
	   
		Locator page=PageFactory.initElements(driver,Locator.class);
		 page.SetUp("Yogesh","Yogesh");
		 
	}

}
