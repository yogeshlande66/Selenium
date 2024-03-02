package Waits;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Properties_1
{
	
public static void main(String args[]) throws IOException
{
 WebDriver driver;
 Properties pro;
 driver=new ChromeDriver();
 pro=new Properties();
 FileInputStream fis=new FileInputStream("C:\\Users\\ADMIN\\eclipse-workspace\\Selenium\\config\\config.properties");
 pro.load(fis);
 driver.get(pro.getProperty("URL"));
 WebElement username=driver.findElement(By.id("user-name"));
 username.sendKeys(pro.getProperty("username"));

 
 WebElement pass=driver.findElement(By.xpath("//input[@id='password']"));
 pass.sendKeys(pro.getProperty("pass"));
 
 driver.findElement(By.xpath("//input[@id='password']")).click();
 System.out.println("The title of the page:"+driver.getTitle());
  driver.quit();
 }
}