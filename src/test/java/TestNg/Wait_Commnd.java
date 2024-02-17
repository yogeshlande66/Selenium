package TestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Wait_Commnd {
	
	public WebDriver driver;
	public  String baseUrl;
	public WebElement element;
	public WebElement element1;
	public WebDriverWait wait;

	
	 @BeforeMethod
	 public void setUp()
	 {
		 driver=new ChromeDriver();
		 baseUrl = "http://www.google.com";
		  wait=new WebDriverWait(driver,Duration.ofSeconds(10)); 	 
	}
	 @Test
	 public  void GetTitle() 
	 {
			 driver.get(baseUrl);
			 element=driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
			 element1=driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']"));
			 element.click();
	 }
@AfterMethod
public  void  tearDown() {
 driver.quit();
	
}

}
