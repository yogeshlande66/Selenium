package Objec;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Page {
 WebDriver driver;
  public Google_Page(WebDriver driver)
  {
	this.driver=driver;
	 
  }
  By searchBox=By.xpath("//textarea[@id='APjFqb']");
  By click=By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']");
  public void SearchPage(String str)
  {
	  driver.findElement(searchBox).sendKeys(str);
	  System.out.println(driver.getTitle());
	  //driver.findElement(click).click();
  }
  
  
}
