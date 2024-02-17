package POM_2024;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomePage {
	//BrowserStackHomePage
	public WebDriver driver;
	public HomePage(WebDriver driver)
	{
       this.driver=driver;
      
	}

	
  By header=By.xpath("//h1[normalize-space()='The Modern Test Stack']");
  By signUp=By.xpath("//span[text()='Sign in']");
	
  public void verifyHeader()
  {
	  try
		{
	  String getHeader=driver.findElement(header).getText();
	  Assert.assertEquals("The Modern Test Stack",getHeader);
  }
	  catch(NoSuchElementException e)
	  {
			System.out.println(e);
			
		}
	}
	
 public void SignUpClick()
 {
	 driver.findElement(signUp).click();
 }
	
}
