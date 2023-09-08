package Interview_22_06_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class Frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	  WebDriver driver=new ChromeDriver();
	 // driver.get("https://google.com");
	  // driver.getCurrentUrl();
	  
	  driver.get("https://javatpoint.com");
	  driver.manage().window().maximize();
	  JavascriptExecutor ex=(JavascriptExecutor)driver;
      ex.executeScript("scrollBy(0, 5000)");  
      
      driver.findElement(By.linkText("Core Java"));
	  
	}

}
