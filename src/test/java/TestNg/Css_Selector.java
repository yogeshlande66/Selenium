package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_Selector {

	
		public static void main(String args[])
		{
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.saucedemo.com/");
		/*WebElement e=driver.findElement(By.cssSelector("input#user-name"));
		WebElement e1=driver.findElement(By.cssSelector("input.input_error"));
		WebElement e2=driver.findElement(By.cssSelector("input[class='input_error']"));
		WebElement e3=driver.findElement(By.cssSelector("input[class='input_error']"));
*/
		//WebElement e4=driver.findElement(By.cssSelector("input.class[input_error']"));
		WebElement e=driver.findElement(By.cssSelector("input#user-name"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
	         js.executeScript("arguments[0].value='dsdfsff';",e);
		/*		e1.sendKeys("fsdgsgsgs");
		e.sendKeys("fdsffgsgg");
		String s=e.getAttribute("value");
		String s1=e1.getAttribute("value");
	
		System.out.println(s1+"\n"+s);
*/
	        
		
	//	driver.close();
		
			
			
		}
	}


