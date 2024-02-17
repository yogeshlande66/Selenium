package TestNG_POM_Project.BaseTest;

import org.checkerframework.framework.qual.DefaultQualifier.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners()	
public class Base_Class {
	WebDriver driver;
	
	
	@Test
	
	public void get()
	{
		driver=new ChromeDriver();
		driver.get("htps://google.com");
		
		
	}
	@Test
	 public void show() {
		 System.out.print(driver.getTitle());
	 }
	 @Test
	 
	  public void test()
	  {
		  System.out.println("This is the test case 3");
		  throw new SkipException("This is the skip exception");
		  
		  
	  }

	
}
