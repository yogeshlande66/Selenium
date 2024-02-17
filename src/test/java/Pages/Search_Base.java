package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Search_Base {
 WebDriver driver;
 public Search_Base(WebDriver driver) 
 {
     this.driver=driver;
    
 }
 By search=By.xpath("//textarea[@id='APjFqb']");
  public void  Search(String Str)
  {
	  driver.findElement(search).sendKeys(Str);
  }

  
	  
  }

