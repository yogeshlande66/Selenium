package Java_2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Boolean_Methods {
	
public static void main(String args[])
{
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.saucedemo.com/");
	 driver.manage().window().maximize();
	 boolean displyed=driver.findElement(By.id("user-name")).isDisplayed();
	 System.out.println(displyed);
	 
	 boolean enabled=driver.findElement(By.id("user-name")).isEnabled();
	 System.out.println(enabled);
	 WebElement button=driver.findElement(By.name("login-button"));
	 System.out.println(""+button.isSelected());
	  driver.quit();
	 
	 
}

}
