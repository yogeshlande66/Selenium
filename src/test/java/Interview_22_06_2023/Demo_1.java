package Interview_22_06_2023;

import java.sql.DriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_1 {
 public static void main(String args[])
 {
	//System.setProperty("webdriver.chrome.drivers","D:\\Browser Binaries\\chromedriver_win32\\chromedriver.exe");
	 
	 WebDriver driver=new ChromeDriver();
	  driver.get("https:google.com");
	  driver.navigate().to("https://youtube.com");
	  driver.navigate().back();
	  driver.navigate().forward();
	  driver.findElement(By.xpath(""));
	  
			  
	 
	   driver.close();
	 
	  
	 }
	

}
