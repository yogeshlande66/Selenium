package Selenium_Api_Testing;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.io.Files;

import Waits.Screenshot;

public class FluentWait1 {
	public static void main(String args[]) throws IOException
			{
		WebDriver driver=new  ChromeDriver();
	     /*FluentWait wait = new FluentWait(driver);ss
	    		wait.withTimeout(Duration.ofSeconds(10));
	    		wait.pollingEvery(Duration.ofMillis(10));
	    		wait.ignoring(Exception.class);
	   	         driver.get("https://google.com");

	    		WebElement element=driver.findElement(By.id("APjFqb"));
	    		wait.until(ExpectedConditions.elementToBeClickable(element));*/
		driver.get("https://google.com");
	    	
	    	
	    	
	    	 driver.quit();
	    	 
	    		    		
	    		
	 
	    

	    		 
	    		
		
			}

}
