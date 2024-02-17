package POM.pageFactory;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
	
public class Page_Factory {
	public WebDriver driver;
	public Properties pro;
	//constructor
	public Page_Factory(WebDriver driver)
	{
	 this.driver=driver;
	 // Pagefactory class
	 PageFactory.initElements(driver,this);
	}
	//Locators
	@FindBy(id="user-name")
	WebElement username;
	@FindBy(how=How.XPATH,using="//input[@id='password']")
	WebElement pass;
	@FindBy(name="login-button")
	WebElement login;
	public void setUserName(String user)
    {
    	username.sendKeys(user);
    	
    }
    public void setPass(String password)
    {
    	pass.sendKeys(password);
    	
    }
    public void clickMe()
    {
    	login.click();
    	System.out.println(driver.getTitle());
    	
    }
    
}
