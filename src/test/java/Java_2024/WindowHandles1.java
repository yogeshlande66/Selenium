package Java_2024;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandles1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50));
		driver.get("https://www.naukri.com/");
		String parent=driver.getWindowHandle();
		Thread.sleep(100);
		WebElement element=driver.findElement(By.xpath("//div[text()='Services']"));	
	    wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
		 Set<String> windows=driver.getWindowHandles();
		  Iterator<String>itr=windows.iterator();
		 while(itr.hasNext())
		 {
			 String child=itr.next();
			  driver.switchTo().window(child);
			 if(driver.getTitle().equals("Resume Writing Services - CV - Bio data | Naukri Fastforward"))
			 {
				driver.close();
				 
			 }
		 }
		  driver.switchTo().window(parent);
		  WebElement jobs=driver.findElement(By.xpath("//div[normalize-space()='Jobs']"));
		   jobs.click();
		   driver.close();
		 		
	}	

}
