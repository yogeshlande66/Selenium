import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date_picker_1 {
	/**
	 * @param ags
	 */
	public static void main(String ags[])
	{
		WebDriver driver=new ChromeDriver();
		
		/* driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		  driver.get("https://www.redbus.in/");
		  driver.manage().window().maximize();
	
		 
		  String year="2024";
		  String month="July";
		  String date="10";
		  driver.findElement(By.xpath("//div[@id='onwardCal']")).click();
		   while(true)
		   {
			   String Monthyear=driver.findElement(By.xpath("//div[@class='DayNavigator__CalendarHeader-qj8jdz-1 fxvMrr']//div[2]")).getText();
			   
			   String arr[]=Monthyear.split(" ");
			   String mon=arr[0];
			   String yr=arr[1];
			   if(mon.equalsIgnoreCase(month) && yr.equalsIgnoreCase(year)) 
			   {
				   break;
				   
				  
			   }
			   else
			   {
				   driver.findElement(By.xpath("//div[@class='DayNavigator__CalendarHeader-qj8jdz-1 fxvMrr']//div[3]//*[name()='svg']")).click();
				   
			   }
		   }*/
		
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		  driver.close();
		  
			   
		   }
		   }
		  
		  	
		  
				 
		
		  
		  
		  
		
	
