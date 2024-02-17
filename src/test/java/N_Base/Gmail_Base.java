package N_Base;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_Base {
	public static WebDriver driver;
		@Before
		public void init()
		{
			 driver=new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			 driver.get("https:// www.gmail.com");
		}
		@After
		public void tearDown()
		{
			Gmail_Base.driver.quit();
			 
		}
		
	
		
	

}
