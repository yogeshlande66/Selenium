package Waits;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		WebElement web=driver.findElement(By.id("a077aa5e"));
		
		driver.switchTo().frame(web);
	    
       driver.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();
       System.out.println("The title of the page"+driver.getTitle());
       
       TakesScreenshot sc=(TakesScreenshot)driver;
       File fis=sc.getScreenshotAs(OutputType.FILE);
       FileUtils.copyFile(fis,new File("C:\\Users\\ADMIN\\eclipse-workspace\\Selenium\\frame.jpg"));
       
      // driver.quit();
      
	}

}
