package Waits;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Screenshot_1 {

	public static void main(String[] args) throws InterruptedException, IOException {	
		WebDriver driver=new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		Thread.sleep(300);
	
		WebElement btn=driver.findElement(By.xpath("//button[@id='myBtn']"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",btn);
		
			
		 System.out.println(driver.getTitle());
			
	WebElement db=driver.findElement(By.xpath("//button[normalize-space()='Double click Here']"));
	
	 Actions act=new Actions(driver);
	
	 act.contextClick(db).doubleClick().perform();
	 Alert alt=driver.switchTo().alert();
     alt.accept();
      
	 
    TakesScreenshot sc=((TakesScreenshot)driver);
    File fis=sc.getScreenshotAs(OutputType.FILE);
    File fis1=new File("C:\\Users\\ADMIN\\eclipse-workspace\\Selenium\\p.jpg");
    
     FileUtils.copyFile(fis,fis1);	
     
     
     
     
     
    
    
    
	 
	 
   
		
			
		
		
		
		
		
		
    //  driver.quit();
	}

}
