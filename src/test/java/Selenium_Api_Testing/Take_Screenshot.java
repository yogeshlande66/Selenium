package Selenium_Api_Testing;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Take_Screenshot {
	 public static void  main(String args[]) throws IOException
	 {
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://google.com");
		 TakesScreenshot screen=((TakesScreenshot)driver);
    	 File src=screen.getScreenshotAs(OutputType.FILE);
    	 Files.copy(src,new File("C:\\Users\\ADMIN\\eclipse-workspace\\Selenium\\tell1.jpg"));
    	 driver.close();
    	
    	
	 }

}
