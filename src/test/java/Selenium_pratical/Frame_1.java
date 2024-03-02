package Selenium_pratical;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Frame_1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		WebElement fr=driver.findElement(By.xpath("//iframe[@id='frm1']"));
		driver.switchTo().frame(fr);	
		WebElement dropwdown=driver.findElement(By.xpath("//select[@id='selectnav1']"));
		dropwdown.click();
		Select sel=new Select(dropwdown);
		sel.selectByIndex(2);
		driver.switchTo().defaultContent();
	    String  title= driver.getTitle();
	    System.out.println(""+title);
	    Assert.assertEquals(title,"Frames Practice - H Y R Tutorials");
		//driver.quit(); 
	}
}
