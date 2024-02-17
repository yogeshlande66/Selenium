package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page {
	public  WebDriver driver;

	public Page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	By user=By.xpath("//input[@id='user-name']");
	By pass=By.xpath("//div[@class='login_password']");
	By login=By.xpath("//input[@id='login-button']");
	public void user(String username)
	{
		driver.findElement(user).sendKeys(username);
	}
	public void Pass(String password)
	{
	 driver.findElement(pass).sendKeys(password);	
	}
	public void log()
	{
		driver.findElement(login).click();
	}
}

