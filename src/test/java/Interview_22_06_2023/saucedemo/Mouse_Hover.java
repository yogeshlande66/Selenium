package Interview_22_06_2023.saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practice.automationtesting.in/");
   WebElement element=driver.findElement(By.xpath("//a[text()='Shop']"));
   Actions act=new Actions(driver);
   act.moveToElement(element).perform();
  
   
   
   driver.close();
   
		
		
		

	}
}
