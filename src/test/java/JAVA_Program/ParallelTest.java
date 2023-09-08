package JAVA_Program;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTest {
	WebDriver driver;
  @Test
  public void f() {
	  driver=new ChromeDriver();
	  driver.get("https://google.com");
	 
  }
  @Test
  public void get()
  {
	  System.out.println(driver.getTitle());
	  
  }
  @Test
  public void show()
  {
	  System.out.println(driver.getCurrentUrl());
	  
  }
}
