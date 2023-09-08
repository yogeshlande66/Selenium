import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyword {
	public static void main(String args[])
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
		
	 driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("Yogesh Lande");
	 Actions act=new Actions(driver);
	 
	 
	 //CNT+A;
	 act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
	 //CNT + TABs
	// act.sendKeys(Keys.TAB).perform();CNTRL+C
	 act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
	 //cnt+tabs
	 act.sendKeys(Keys.TAB).perform();
	 act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
	 System.out.println(driver.getTitle());
	 

	 
	 
	 
	 
	 
	 
	
	 
		
		
		
		//driver.close();
		
		 
	
	}

}
