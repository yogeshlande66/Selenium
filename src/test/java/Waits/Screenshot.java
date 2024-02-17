package Waits;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
	 driver.get("https://google.com");
		
		

	    TakesScreenshot sc=((TakesScreenshot)driver);
	    File fis=sc.getScreenshotAs(OutputType.FILE);
	    File fis1=new File("F:\\page.jpg");
	    
	    FileUtils.copyFile(fis, fis1);
	    
	     
	     
	     driver.quit();
	     

	}

}
