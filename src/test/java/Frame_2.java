import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_2 {
	public static void main(String args[])
	{
	
		// open URL, Move to main frame, Move to current FrameSSSS
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://jqueryui.com/selectable/");
		
	
	//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		driver.switchTo().frame("demo-frame");
			driver.findElement(By.xpath("//li[normalize-space()='Item 1']")).click();
		System.out.println(driver.getTitle());
		driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//a[normalize-space()='Draggable']")).click();
		
		//driver.close();
		
        
	

	 
	 
		
		
	}

}
