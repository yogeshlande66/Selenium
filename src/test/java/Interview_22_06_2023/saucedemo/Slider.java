package Interview_22_06_2023.saucedemo;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverInfo;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.base.Preconditions;

public class Slider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/slider/range.html");
		driver.manage().window().maximize();
		 WebElement element=driver.findElement(By.xpath("//span[1]"));
		 
		 System.out.println("Get The location:"+element.getLocation());
		 System.out.println("Size:"+element.getSize());
		 Actions act=new Actions(driver);
		 act.dragAndDropBy(element,250,0).perform();
		 
		 System.out.println("Get The location:"+element.getLocation());
		 System.out.println("Size:"+element.getSize());
		 
		/* WebDriverWait mywait=new WebDriverWait(driver, Duration.ofSeconds(10));
		 WebElement element1=driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default ui-state-hover']"));
		 mywait.until(Preconditions.invisibilityOf(driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default ui-state-hover']"))));
    	 System.out.println(element1.getLocation());
		 */
		 driver.close();
		 
	
		 
		 
	

	

	}

}
