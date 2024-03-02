package Selenium_pratical;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.sun.tools.xjc.Driver;

public class ClickAndRelease {

	public static void main(String[] args) {
		
		WebDriver driver=new  ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		
		driver.get("https://www.selenium.dev/selenium/web/mouse_interaction.html");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		WebElement element=driver.findElement(By.xpath("//a[text()='Click for Results Page']"));
		String s=element.getText();
		System.out.println(s);
	//	wait.until(ExpectedConditions.elementToBeClickable(element));
		/*act.click(element).perform();
		Assert.assertTrue(driver.getCurrentUrl().contains("resultPage.html"));*/
		driver.quit(); 
	}

}
