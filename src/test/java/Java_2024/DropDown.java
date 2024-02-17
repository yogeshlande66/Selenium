package Java_2024;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
	//	driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		WebElement element=driver.findElement(By.xpath("//select[@name='country']"));
		Select sel=new Select(element);
	    //sel.deselectByVisibleText("INDIA");
	    //sel.deselectByVisibleText("INDIA");
	    //sel.selectByIndex(3);
	     //sel.selectByValue("ANDORRA");
		//Get the all option in dropdown using getOptions method 	
	   List<WebElement> options=sel.getOptions();
	   for(WebElement el:options)
	   {
		   System.out.println(el.getText());
		   if(el.getText()=="INDIA")
		   {
			   el.click();
			   break;
	        }
		  
	   }
	   driver.quit();
	}

}
