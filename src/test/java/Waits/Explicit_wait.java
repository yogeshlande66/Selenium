package Waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Explicit_wait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(3));
		
	FluentWait<WebDriver> fwait=new FluentWait(driver)
			.withTimeout(Duration.ofSeconds(10))
			.pollingEvery(Duration.ofSeconds(10))
			.ignoring(NoSuchElementException.class);
		
	 
		// driver.get("");

		driver.get("https://google.com");
WebElement web=mywait.until(ExpectedConditions.visibilityOfElementLocated((By)  driver.findElement(By.id("APjFqb"))));
web.sendKeys("Facebook",Keys.ENTER);
System.out.println("The title of the page:"+driver.getTitle());

	  driver.quit();
	
	}

}
