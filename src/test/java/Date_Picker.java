import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date_Picker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		/*String year="2021";
		String month="June";
		String day="10";
		driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[2]/main[1]/div[3]/div[1]/div[1]/div[1]/div[4]/div[1]/i[1]")).click(); //  open the date pickers
		while(true)
		{
		String monthyear=driver.findElement(By.xpath("//div[@class='DayNavigator__CalendarHeader-qj8jdz-1 fxvMrr']//div[2]")).getText();
	String arr[]=monthyear.split("");
	String montn=arr[0];
	String yr=arr[1];
	if (montn.equalsIgnoreCase(month) && yr.equals(year))s
	{
		break;	
	}
	else
	{
		driver.findElements(By.xpath("//div[@class='DayNavigator__CalendarHeader-qj8jdz-1 fxvMrr']//div[2]"));
		
	
		
		}
	}
	*/
		
	driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	driver.findElement(By.id("datepicker")).click();
	 
	while(true)
	{
		String month=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		String yeaar=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		if(yeaar.equals("2021") && month.equals("May"))
		{
       
		
			System.out.println("test case passed");
			System.out.println(month+"\n"+yeaar);
			break;
		}
		else
		{
			
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
			
			
		}
		
		
	}
	driver.quit();
	
	
	
	
	}
}


