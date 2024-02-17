package Interview_22_06_2023.saucedemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleCheckBox {
	
	 public static void main(String args[])
	 {
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://total-qa.com/checkbox-example/");
		
		 List<WebElement> list= driver.findElements(By.xpath("//input[@name='chk']"));
		  System.out.println(list.size());
		  driver.quit();
		  for(int i=0;i<=4;i++)
		  {
			  list.get(i).click();
		 
		  }
	
				 }

}
