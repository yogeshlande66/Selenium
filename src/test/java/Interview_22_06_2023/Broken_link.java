package Interview_22_06_2023;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_link {

	public static void main(String[] args)
	{
	   
		WebDriver driver=new  ChromeDriver();
		driver.get("https://www.amazon.in/");
		 driver.manage().window().maximize();
		  driver.findElement(By.linkText("Sell")).click();
		// driver.findElement(By.partialLinkText("Sel")).click();
		 
       List<WebElement> link=driver.findElements(By.tagName("a"));
        System.out.println("The totala link of the page:"+link.size());
        for(int i=0;i<link.size();i++)
        {
        	System.out.println(link.get(i).getText());
        	System.out.println(link.get(i).getAttribute("href"));
        
        	
        }
        
        
		 
		 
			
		}

	
}
