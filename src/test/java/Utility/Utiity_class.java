package Utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Utiity_class {
	public static WebDriver SatrtAppli(WebDriver driver,String browserName,String appUrl)
	{
		if(browserName.equals("Chrome")) {
		   driver=new ChromeDriver();
		}
		else if(browserName.equals("Firefox"))
		{
			 driver=new FirefoxDriver();
		}
		else
		{
			System.out.print("Not Support for th Any browser");
		}
		
		driver.manage().window().maximize();
		driver.get(appUrl);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		return driver;
		
	}
	public static void quit(WebDriver driver)
	{
		driver.quit();
		
	}

}
