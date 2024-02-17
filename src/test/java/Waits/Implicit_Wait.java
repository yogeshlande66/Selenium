package Waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_Wait {

	public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		 
			 driver.get("https://www.saucedemo.com/");
		    WebElement user= driver.findElement(By.xpath("//input[@id='user-name']"));
		    user.sendKeys("standard_user");
		    
		   WebElement pass=driver.findElement(By.xpath("//input[@id='password']"));
		  
		   pass.sendKeys("secret_sauce");
		     if(user.equals("standard_user") && pass.equals("secret_sauce"))
		     {
		    	 driver.findElement(By.xpath("//input[@id='login-button']")).click();
		  	  
		    	// Thread.sleep(200);
		    	 System.out.println(driver.getTitle());
		     driver.navigate().to("https://google.com");	
		     
		    	 
		     }
		   //  driver.findElement(By.xpath("//input[@id='login-button']")).click();
			   
			    
		
		driver.quit();
		

	}

}
