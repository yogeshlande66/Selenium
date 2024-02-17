package Java_2024;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementFindElemets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		 driver.get("https://demo.nopcommerce.com/login");
		 driver.manage().window().maximize();
	    List<WebElement> links =driver.findElements(By.xpath("//div[@class='footer']//a"));
	  //System.out.println(element.getText());
	   System.out.println(links.size());
	  /* for(WebElement el:links)
	   {
		   System.out.println(el.getText());
	   }
	     */
	   for(int i=0;i<links.size();i++)
	   {
		   System.out.println(links.get(i).getText());
	   }
	   
	   
	    driver.quit();
	   

	}

}
