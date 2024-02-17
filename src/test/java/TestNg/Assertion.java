package TestNg;

import org.testng.annotations.Test;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

	public class Assertion {
		
		WebDriver driver;
	
		
		@BeforeMethod
		public void setup()
		{
	       driver=new ChromeDriver();
			driver.manage().window().maximize();
			//driver.get("https://google.com");
			
		}
		@Test
		
		void login()
		{
			driver.get("https://google.com");
			
		}

		

		

	}

