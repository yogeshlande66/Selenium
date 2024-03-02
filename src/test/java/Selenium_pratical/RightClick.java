package Selenium_pratical;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RightClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		 WebDriver driver=new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20)); 
	        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	        Actions act=new Actions(driver);
	        WebElement element=driver.findElement(By.xpath("//span[text()='right click me']"));
	      
	        driver.quit();
	}

}
