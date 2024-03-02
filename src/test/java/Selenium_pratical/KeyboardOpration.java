package Selenium_pratical;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardOpration {

	public static void main(String[] args)
	{
		WebDriver driver=new  ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.xpath("//input[@id='userName']"));
		WebElement pass=driver.findElement(By.xpath("//input[@id='userEmail']"));
		Actions act=new Actions(driver);
		username.sendKeys("dgssgs");
	    username.sendKeys(Keys.CONTROL,"A");
	    username.sendKeys(Keys.CONTROL,"C");
	    pass.sendKeys(Keys.CONTROL,"V");
	 
	}

}
