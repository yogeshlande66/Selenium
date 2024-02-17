package Interview_22_06_2023;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class Implicitwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
	FluentWait<WebDriver> mywait=new  FluentWait<WebDriver>(driver)
		.withTimeout(Duration.ofSeconds(30))
	    .pollingEvery(Duration.ofSeconds(5))
	    .ignoring(NoSuchElementException.class);
	
	
		 driver.get("https://google.com");
		 driver.manage().window().maximize();
	//	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		 
		 //WebDriverWait  wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		   
	
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("selenium");
		 //driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys(Keys.RETURN);
		
		 //WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='WebDriver']")));
		// element.click();
		 
		 WebElement foo=mywait.until(new Function<WebDriver, WebElement>() 
		 {
			 public WebElement applyy(WebDriver driver,WebElement element) 
			 {
			 return driver.findElement(By.xpath("//a[text()='WebDriver']"));
			 }

			@Override
			public WebElement apply(WebDriver input) {
				// TODO Auto-generated method stub
				return null;
			}

		
			 });
		 foo.click();
		 
		 
	
		 System.out.println(driver.getTitle());
		 
		 	
		 
		 
		  
		 
		 driver.quit();
		  
		 
		 
		 
		 

		 
		
		
				
			

		
	}

}
