package Utility_DataDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assertion_1 {
	
	public void validatePageUrl(WebDriver driver,String Exp_Url)
	{
 boolean flag=false;
	 
	 if(driver.getCurrentUrl().equals(Exp_Url))
	 {
		 flag=true;
	 }
	

	}
	

}
