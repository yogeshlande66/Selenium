package Interview_22_06_2023.saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class date_picker {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.redbus.in/");
		//driver.get("https://jqueryui.com/");
		//WebElement element=driver.findElement(By.xpath("//a[normalize-space()='Datepicker']"));
	/*
	 driver.get("http://demo.guru99.com/test");
	 WebElement element=driver.findElement(By.xpath("//input[@name='bdaytime']"));
	  element.sendKeys("09122023");
	  element.sendKeys(Keys.TAB);
	  element.sendKeys("0245PM");
	  element.sendKeys(Keys.TAB);
	   driver.findElement(By.xpath("//input[@type='submit']")).click(); */
		 
		 driver.get("https://jqueryui.com/datepicker/");
	   
	//	WebElement  element=driver.findElement(By.xpath(x));
		
		driver.switchTo().frame(0);
		
		WebElement date=driver.findElement(By.xpath("//input[@id='datepicker']"));
		
		date.click();
		
		while(true)	
		{
			String  smonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			
			String  year=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		
			if(smonth.equals("September") && year.equals("2023"))
			{
			 driver.findElement(By.xpath("//a[normalize-space()='1']")).click();
			 break;
			 
			}
			else
			{
				 driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
				 
			}
		}
		
				
	   
	
	   // driver.quit();
	    
	    
	   
	   
	  
	  
	 
	 
	 
	

	}

}
