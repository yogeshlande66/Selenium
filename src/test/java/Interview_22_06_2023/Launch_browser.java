package Interview_22_06_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_browser { 
	public static void  main(String args[])
	{
		WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://google	.com");
	 driver.navigate().to("https://javatpoint.com/selenium-tutorial");
	 driver.navigate().back();
	  driver.getPageSource();
	  //driver.findElement(By.xpath("//h1[normalize-space()='Selenium WebDriver- Commands']")).getText();
	 // driver.findElement(By.name("search")).sendKeys("https://www.javatpoint.com/selenium-webdriver-commands");
	  
	 
	
	 driver.close();
		
	}

}
