package Interview_22_06_2023.saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HomePage {
	public static void main(String args[])
	{
		WebDriver driver=new ChromeDriver();
		/*driver.get("https://www.saucedemo.com/");
	
		 driver.manage().window().maximize();
		System.out.println("Username field Should be clickable:" +driver.findElement(By.id("user-name")).isEnabled());
		
	    System.out.println("The password Should be clikable :"+driver.findElement(By.xpath("//input[@id='password']")).isEnabled());

	   WebElement login=driver.findElement(By.xpath("//input[@type='submit']"));
	   if(login.isDisplayed())
	   {
		   login.click();
		   
		}
	    System.out.println("The title of the page: "+driver.getTitle());
	    
	String s= driver.findElement(By.xpath("//div[text()='Swag Labs']")).getText();
	System.out.println("The text of the given link on the home page:" +s);
	 
	String user="standard_user";
	String pass_="secret_sauce";
	WebElement user_name=driver.findElement(By.id("user-name"));
	user_name.sendKeys("standard_user");
	WebElement pass=driver.findElement(By.xpath("//input[@id='password']"));
	pass.sendKeys("secret_sauce");
	
    if(user_name.equals(user) && pass.equals(pass_))
    {
    	login.click();
    }
     System.out.println("The title of the page after Assertion:"+driver.getTitle());  */
		 driver.get("https://www.testandquiz.com/selenium/testing.html");

     driver.close();	
	}
}