package Interview_22_06_2023;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	public static void main(String args[])
	{
	   WebDriver driver=new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.get("https://amazon.com");
	   WebElement amz_Search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	   
	  
	   
	   driver.quit();
	   
	   
	   
	  
	   
	    
	}
}
