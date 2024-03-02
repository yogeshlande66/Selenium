package Selenium_pratical;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sun.tools.xjc.Driver;

public class DrapAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  WebDriver driver=new ChromeDriver();
			
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20)); 
		  driver.get("https://the-internet.herokuapp.com/drag_and_drop");
		  driver.manage().window().maximize();
		  WebElement source=driver.findElement(By.xpath("//div[@id='column-a']"));
		  WebElement distinatio=driver.findElement(By.xpath("//div[@id='column-b']"));
		  Actions act=new Actions(driver);
		  act.dragAndDrop(source, distinatio).perform();
		  driver.quit();
		  }
}
