package Java_2024;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitCommands {
	 public static void main(String args[])
	 {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		  driver.get("https://google.com");
		  WebElement element=driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		  wait.until(ExpectedConditions.visibilityOf(element));
		  element.sendKeys("gsgsgfhfh");
		  element.click();
		  driver.quit();
	 }

}
