package Selenium_Api_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import groovyjarjarantlr4.v4.parse.ANTLRParser.element_return;


public class ScrollBy_1 {
 public static void main(String args[])
 {
	  WebDriver driver=new ChromeDriver();
	 // driver.get("https://opensource-demo.orangehrmlive.com/");
	  driver.get("https://javatpoint.com");
	  WebElement search=driver.findElement(By.xpath("//input[@id='gsc-i-id1']"));
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  /*driver.get("https://javatpoint.com");
	  driver.manage().window().maximize();
	  WebElement element=driver.findElement(By.linkText("2nd Nov - Samsung Galaxy Z Flip3 5G Review"));
	 // js.executeScript("window.scrollBy(500,1000)","");
	  
	  js.executeScript("arguments[0].scrollIntoView();",element);	
	  element.click();
	   driver.quit();*/
	  js.executeScript("arguments[0].value='yogesh'",search);
 
 }

}
