package POM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import POM.pageFactory.Page_Factory;	

public class Logo_Test {
			
	WebDriver driver;
	Logo lg;
	Properties pro;
	//Page_Factory p
	@BeforeClass  
	public void setUp() throws IOException
	{
        FileInputStream  file=new FileInputStream("");
    	  
          pro=new Properties();
    	  pro.load(file);
	      driver=new ChromeDriver();	
	      driver.get("URL");
	      driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      
	}  
	@Test(priority=0) 
	public void logo_Test()
	{
		
		/* pg=new Page_Factory(driver);
	     pg.setUserName("st
	     andard_user");
   	     pg.setPass("secret_sauce");
   	     pg.clickMe();*/
	  //  driver=new ChromeDriver();
		lg=new Logo(driver);
		lg.setUserName(pro.getProperty("User"));
		lg.setPass("gdgdgg");
		lg.clickMe();
		
	   System.out.println(lg.logoPresent());
	}
	@Test(priority=1)
  public void Logi_Test()
	{
		System.out.println(driver.getTitle());
	}
	@AfterClass
	public void tearDown()
	{ 
		driver.quit();
		
	}

}
