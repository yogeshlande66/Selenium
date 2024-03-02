package Selenium_pratical;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class ClickAndHold {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new  ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/selenium/web/mouse_interaction.html");
		
		Actions act=new Actions(driver);
		WebElement element=driver.findElement(By.id("clickable"));
		act.clickAndHold(element).perform();
		Assert.assertEquals("focused",driver.findElement(By.xpath("//strong[@id='click-status']")).getText());
	}

}
