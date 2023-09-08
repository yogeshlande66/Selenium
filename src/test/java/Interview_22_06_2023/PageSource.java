package Interview_22_06_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageSource {
	
 public static void main(String args[])
 {
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://youtube.com");
	 System.out.println(driver.getPageSource());
	  System.out.println(driver.getTitle());
	  driver.findElement(By.xpath("//input[@id='search']")).sendKeys("dsgsgsfsfh");
	  driver.findElement(By.xpath("//input[@id='search']")).clear();
	  
	  
	  
	  
	  
	  driver.close();
	   
	  
	   
	 
	   
 }

	
}
	