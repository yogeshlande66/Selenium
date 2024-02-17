package Utility_DataDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public  class Login_Page {
	WebDriver driver;
	public Login_Page(WebDriver driver)
	{
		this.driver=driver;
	}

	// using the locator to locate the element
	public void enterUsername(String name)
	{
		driver.findElement(By.id("user-name")).sendKeys("name");
	}
	public void enterPass(String passs)
	{
   driver.findElement(By.xpath("//input[@id='password']")).sendKeys("pass");		
	}
	public void clickMe()
	{
		driver.findElement(By.xpath("//input[@id='login-button']")).click();	
		
	}
	

	
}
