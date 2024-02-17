package Interview_22_06_2023.saucedemo;

import java.awt.List;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.collections.Sets;


public class DropDown {
	public static void main(String args[])
	{
		WebDriver driver=new ChromeDriver();
		 driver.get("https://demo.guru99.com/test/newtours/register.php");
		 driver.manage().window().maximize();
		 System.out.print(driver.getTitle());
		 
	
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  WebElement element=driver.findElement(By.xpath("//select[@name='country']"));
		
	// Selects sel=new Selects();
	    // sel.selectByVisibleText("INDIA")
	     //sel.selectByIndex(3);
	     //sel.selectByValue("ANGUILLA");
		java.util.List<WebElement> options=(java.util.List<WebElement>) new List();
		
		for(WebElement op:options)
		{
			if(op.getText().equals("INIDA"))
			{
				op.click();
				System.out.println("The text of the dropwdown method:" +op.getText());
			
				 break;
				
			}
		}
		
		 
	     
	     
		 
		 
		// driver.close();
		 
		 
	}

}
