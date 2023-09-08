package Interview_22_06_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Login_Functionality {
	public static void main(String args[])
	{
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://www.linkedin.com/home");
		
	    driver.manage().window().maximize();
	  WebElement username= driver.findElement(By.id("session_key"));
	  WebElement pass=driver.findElement(By.name("session_password"));
	  
	  WebElement login=driver.findElement(By.xpath("//button[normalize-space()='Sign in']"));
	  username.sendKeys("fgsgssg");
	  pass.sendKeys("fsgsggss");
	  login.click();
	   String Act="https://www.linkedin.com/home";
	   String exp=driver.getCurrentUrl();
	 if(Act.equals(exp))
	   {
		   System.out.println("Test case is passed");
		   
	   }
	   else
	   {
		   System.out.print("Test case is failed");
	 
	 } 
	   //Assert.assertEquals(exp,Act);
	   driver.close();

	
	}

	
}
