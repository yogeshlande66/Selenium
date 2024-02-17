
package Java_2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AssertionFalse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://saucedemo.com/");
		 //Assert.assertFalse(driver.findElement(By.id("login-button")).isSelected());
		// System.out.println(driver.findElement(By.id("login-button")).isSelected());

		
		
		 // USING true Assertion
		/* driver.findElement(By.id("login-button")).click();	
		 Assert.assertTrue(driver.findElement(By.id("login-button")).isSelected());
		 System.out.println(driver.findElement(By.id("login-button")).isSelected());
		 driver.quit();*/
		 
		 
		 // Assert.asserEquals();
		 /*
	Assert.assertEquals("Swag Labs",driver.getTitle());
	   System.out.println("Sucessfully assert is executed");
	   driver.quit();   */
		 
		 // Assert.assertNotEquals()
		  
	/*	Assert.assertNotEquals("Yogesh",driver.getTitle());
		System.out.println("Assert is not matched");
		driver.quit();   */
		 
		 //Assert.asserNull;
		 
		//Assert.assertNull(null);
		 Assert.assertNotNull(10);
		System.out.println("The assert is not null");
		driver.quit();
		
		
		 
		 
	    
		 
		 
		 
		

	}

}
