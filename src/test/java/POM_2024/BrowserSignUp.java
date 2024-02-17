package POM_2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class BrowserSignUp {
	  
	WebDriver driver;
	public BrowserSignUp(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By username=By.id("user_email_login");
	By password=By.id("user_password");
	By login=By.partialLinkText("Sign");
	
	public void EnterUsername(String userName)
	{
	 driver.findElement(username).sendKeys(userName);
	
	}
	public void  EnterPassword(String pass)
	{
		driver.findElement(password).sendKeys(pass);
	}
	public void LoginClick()
	{
		driver.findElement(login).click();
		Assert.assertEquals(true,"Sucessfully click on signup");
		
	}
}
