package Interview_22_06_2023.saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Right {
	public static void main(String args[])
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		 driver.manage().window().maximize();
		/*WebElement element= driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		 Actions act=new Actions(driver);
		 act.contextClick(element).perform();*/
	
		/* WebElement element= driver.findElement(By.xpath("//button[normalize-space()='Double-Click Me To See Alert']"));
		 
 act.doubleClick(element).perform();*/
	WebElement target=driver.findElement(By.xpath("//ol[@id='amt8']//li[@class='placeholder']"));
	WebElement source=driver.findElement(By.xpath("//section[@id='g-container-main']//li[1]//a[1]"));

	 Actions act=new Actions(driver);
	 act.dragAndDrop(source, target).perform();
	 
	 

		
		
	
		
	}

}
