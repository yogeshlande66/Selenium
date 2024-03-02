package Selenium_pratical;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandle {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20)); 
		driver.get("https://www.naukri.com/");
		String parentString=driver.getWindowHandle();
	
		WebElement services=driver.findElement(By.xpath("//div[contains(text(),'Services')]"));
		wait.until(ExpectedConditions.elementToBeClickable(services));
		services.click();
		Set<String> allwindow=driver.getWindowHandles();
		Iterator<String>itr=allwindow.iterator();
		while(itr.hasNext())
		{
			String child=itr.next();
			driver.switchTo().window(child);
		   System.out.println(driver.getTitle());
		}
		driver.switchTo().window(parentString);
	    System.out.println("parent window:"+driver.getTitle());	
		}	
	}
