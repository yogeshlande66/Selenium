package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Logo {
public WebDriver driver;
	//Constructor
	public Logo(WebDriver driver)
	{
		this.driver=driver;
		
	}
	//Locators
    By logo=By.xpath("//div[@class='login_logo']");
    By username=By.id("user-name");
    By pass=By.xpath("//input[@id='password']");
    By login=By.name("login-button");
    //https://www.saucedemo.com/
    
    
    //Actions method
    public void setUserName(String user)
    {
    	 driver.findElement(username).sendKeys(user);
    	
    }
    public void setPass(String password)
    {
    	driver.findElement(pass).sendKeys(password);
    	
    }
    public void clickMe()
    {
    	driver.findElement(login).click();
    }
    public boolean logoPresent()
    {
    	boolean statusLogo=driver.findElement(logo).isDisplayed();
     return statusLogo;
    }
  
}
