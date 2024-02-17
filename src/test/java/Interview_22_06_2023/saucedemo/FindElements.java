package Interview_22_06_2023.saucedemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		 List<WebElement> list=driver.findElements(By.xpath("//label[normalize-space()='Person With Disability Concession']"));
		  
		 for(int i=0;i<list.size();i++)
		 {
		    System.out.println(list.get(i).getText());
		    
		 }
      
	}

}
