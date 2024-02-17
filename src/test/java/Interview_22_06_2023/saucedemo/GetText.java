package Interview_22_06_2023.saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://only-testing-blog.blogspot.com/2022/11/relationship.html");
	 WebElement element= driver.findElement(By.xpath("//input[@id='gparent_1']"));
  element.sendKeys("fssgsgsg");
  element.clear();
 System.out.print(element.getAttribute("name"));
  

	  driver.quit();
	}

}
