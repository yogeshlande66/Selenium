package POM.pageFactory;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import POM.Page;

public class TestCase {
	Page pg;
	WebDriver driver;
	
	
	@BeforeClass
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
	}
	
    @Test(priority=0)
    
	public void test() {
    	
    	pg=new Page(driver);
    	pg.user("fdsgsgsg");
    	pg.Pass("ddgggg");
    	
	}
    @AfterClass
    public void tearDown()
    {
    	driver.close();
    	
    }

}
