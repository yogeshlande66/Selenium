package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Locator {
	WebDriver driver;
 public Locator(WebDriver driver)
 {
	 this.driver=driver;
 }
	 
 @FindBy(xpath="//input[@id='email']")
 WebElement username;
 
 @FindBy(name="pass")
 WebElement pa;	
 
 @FindBy(name="flogin")
 WebElement login;
 
 public void SetUp(String User,String pwd)
 {
	 username.sendKeys(User);
	 pa.sendKeys(pwd);
	 login.click();
 }	
 

}
