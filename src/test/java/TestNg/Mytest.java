package TestNg;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Mytest {
	WebDriver driver;

   	public void setUp()
	{
		 driver.get("https://amazon.in");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}


	public void tearDown()
	{
	  driver.quit();
	  
	}

@Test
public void asserTion()
{
	String title=driver.getTitle();
	String expectedTitile=driver.getTitle();
	assertEquals(title,expectedTitile);
}


}
