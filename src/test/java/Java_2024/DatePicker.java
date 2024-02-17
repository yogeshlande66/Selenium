
package Java_2024;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		String year="2034";
		String month="Feb";
		String date="8";
		driver.findElement(By.xpath("//div[@id='onwardCal']")).click();
	    while(true)
	    {
		 String monthyear=driver.findElement(By.xpath("//div[@class='DayNavigator__CalendarHeader-qj8jdz-1 fxvMrr']//div[2]")).getText();
		 String arr[]=monthyear.split(" ");
		 String mon=arr[0];
		 String yr=arr[1];
		 if(mon.equalsIgnoreCase(year) && yr.equalsIgnoreCase(year))
		 {
			 break;
		 }
		 else
		 {
			 System.out.println("Date and month are not matched");
		 }
		 
		List<WebElement> date7=driver.findElements(By.xpath("[@class='DayNavigator__CalendarHeader-qj8jdz-1 fxvMrr']//div[3]//*[name()='svg']"));
		for(WebElement e:date7)
		{
			String s=e.getText();
			s.equals(date);
		 e.click();	
		break;
			
		}
		driver.quit();
		 
	    }
	}
	
}
