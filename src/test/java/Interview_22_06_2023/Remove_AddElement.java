package Interview_22_06_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Remove_AddElement {
	public static void main(String args[])
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		   System.out.println("demoqa webpage displayed");
			
		   //Maximise browser window
		   driver.manage().window().maximize();
			 
		   //Instantiate Action Class
		   Actions actions = new Actions(driver);
			 
		   //Retrieve WebElement to perform right click
		   WebElement btnElement = driver.findElement(By.id("rightClickBtn"));
		   WebElement Double= driver.findElement(By.id("doubleClickBtn"));
		  // WebElement click= driver.findElement(By.xpath("//button[@id='apHLN']"));

		   
			 
		   
		   //Right Click the button to display Context Menu&nbsp;
		   actions.contextClick(btnElement).perform();
		   System.out.println("Right click Context Menu displayed");
actions.doubleClick(Double).perform();
		   System.out.println("Double click perfomred");
		 //  actions.click(click).perform();
		   
		   
		   
		 //  driver.close();
		   
		   
		  }
		  
	
		 
		
		
	}

