package Selenium_pratical;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AutoSuggestive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    WebElement google= driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
     	google.sendKeys("iphone");
	    
		List<WebElement> list=driver.findElements(By.xpath("//div[@class='wM6W7d']//child::span[contains(text(),'iPhone')]"));
		int size=list.size();
		System.out.println(size);
	     for(WebElement el:list)
	     {
	      String  s= el.getText();
	      System.out.println(""+s);
	     }
	     String title=driver.getTitle();
	    Assert.assertEquals(title,"iphone 16 - Google Search");
	     driver.quit();
	}
}