package Interview_22_06_2023.saucedemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date_1 {
	public static void main(String args[])
	{
   WebDriver driver=new ChromeDriver();
  // driver.get("https://www.globalsqa.com/demo-site/datepicker/#Simple%20Date%20Picker");
  //  driver.get("https://demos.telerik.com/kendo-ui/datetimepicker/index");
    driver.get("https://www.redbus.in/");
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 /*WebElement searchBox=driver.findElement(By.name("bdaytime"));
  searchBox.sendKeys("29092023");
  System.out.println("The text of the page:"+searchBox.getText());
  	
  searchBox.sendKeys(Keys.TAB);
  searchBox.sendKeys("0245PM");
  driver.findElement(By.xpath("//input[@type='submit']")).click();
  String s=driver.getTitle();
  System.out.println("The text of the page:"+searchBox.getText());
  
  System.out.println("The title of the page"+s); */
  // WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
   //driver.switchTo().frame(frame);
 //  WebElement searchBox=driver.findElement(By.xpath("//input[@id='fdatepicker']"));
   // searchBox.click();
  //WebElement search=driver.findElement(By.xpath("//a[normalize-space()='1']"));
    //search.click();
  
  
  
  
 driver.findElement(By.xpath("//div[@id='onwardCal']")).click();
 WebElement date=driver.findElement(By.xpath("//div[@class='sc-kAzzGY llxTcS']"));
 date.click();
 
 
  
 
 
  //driver.quit();
   
	}

}
