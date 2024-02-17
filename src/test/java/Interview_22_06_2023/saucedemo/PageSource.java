package Interview_22_06_2023.saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageSource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver  driver=new  ChromeDriver();
		driver.get("https://google.com");
		 String s=driver.getPageSource();
		 WebElement element=driver.findElement(By.xpath("//img[@alt='Google']"));
		 System.out.println(element.isDisplayed()+""+element.isEnabled());
		// System.out.println(s);
		 
		 driver.quit();
		 

   
  
	}

}
