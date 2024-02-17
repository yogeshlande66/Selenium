import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getWindowHandle {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
			WebDriver driver=new ChromeDriver();
			 driver.get("https://www.geeksforgeeks.org/");
			 driver.manage().window().maximize();
			 driver.manage().deleteAllCookies();
			 JavascriptExecutor je = (JavascriptExecutor)driver;
		        je.executeScript("window.scrollBy(0, 200)");
		        driver.findElement(By.xpath("(// span[text()='Courses at GeeksforGeeks'])[2]")).click();
		        Thread.sleep(2000);
		        driver.findElement(By.xpath("//span[normalize-space()='Courses']"));
		        
			 // Visit the official site of geeksforgeeks.org
			/* Click on courses at GeeksforGeeks from quick links     
			 Select a particular course ( Open with a new window )
			 Click on the element of the new window 
			*/
		        
			 

	
			
		}

}
