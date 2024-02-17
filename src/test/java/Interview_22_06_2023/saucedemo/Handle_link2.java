package Interview_22_06_2023.saucedemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_link2 {
	
	public static void main(String args[])
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		//driver.findElement(By.linkText("Deals")).click();
		//driver.findElement(By.partialLinkText("De")).click();
		List<WebElement> element=driver.findElements(By.tagName("a"));
	  int  link=element.size();
	  
	  System.out.println(link);
	  for(int i=0;i<element.size();i++)
	  {
		  System.out.println(element.get(i).getText());
		  
	  }
	
	 
		   driver.quit();

	   
	   
		
		
		
	}
}
