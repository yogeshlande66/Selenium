package Interview_22_06_2023.saucedemo;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(@href,'popup.php')]")).click();
		String main=driver.getWindowHandle();
		System.out.print(main);
		Set<String> list=driver.getWindowHandles();
		Iterator<String> itr=list.iterator();
	while(itr.hasNext())
	{
		String child=itr.next();
		if(!main.equalsIgnoreCase(child))
		{
			 driver.switchTo().window(child);
			 driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("yogesh@gmail.com");
			 driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
			 driver.close();
		
		}

	}
	// driver.switchTo().window(main);
	driver.switchTo().defaultContent();
	
		
		driver.close();
		
			//driver.quit();
		
		
		

		
		
			
		
		
		
		

	}

}
