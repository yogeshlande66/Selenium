package TestNg;

import java.lang.module.ModuleDescriptor.Exports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assert_1 {
	
	WebDriver driver;
	
	

	
	
	
	
	
	@BeforeTest
	public void setup()
	{
        driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		
	}
	@Test
	
	void login()
	{
		//driver.get("https://google.com");
		
	}

	

	

}
