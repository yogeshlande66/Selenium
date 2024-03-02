package Selenium_pratical;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class DoubleClick {

	public static void main(String[] args) 
	{

        WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20)); 
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        Actions act=new Actions(driver);
        WebElement element=driver.findElement(By.xpath("//button[normalize-space()='Double-Click Me To See Alert']"));
        act.doubleClick(element).perform();
        Assert.assertTrue(true,"SSucessfully click on ouble clicked");
        driver.quit();
	}

}
