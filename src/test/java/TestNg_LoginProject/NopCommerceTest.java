package TestNg_LoginProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNg_LoginProject.ExtedsReports.class)
public class NopCommerceTest
{
	WebDriver  driver;
	@BeforeClass
	 void SetUp()
	 {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
	 }
	@Test(priority=1)
	void TestLogo()
	 {
		try
		{
		 boolean status=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		 Assert.assertEquals(status,true);
		}
		 catch(Exception e)
		{
		 System.out.println(e);
		}
	 }
	 
	@Test(priority=2)
	 void TestLogin()
	 {
		try
		{
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.xpath("//input[@class='email']")).sendKeys("xyz123@gmail.com");
		driver.findElement(By.xpath("//input[@class='password']")).sendKeys("test123");
		driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
		Assert.assertEquals(true,false);	
		}
		catch(Exception e)
		{
			Assert.fail();
		}
	
	 }
	@Test(priority=3,dependsOnMethods="TestLogin")
	void TestLogout() throws InterruptedException
	{
		driver.findElement(By.linkText("Log out")).click();
		Thread.sleep(50);
		boolean status=driver.findElement(By.linkText("Register")).isDisplayed();
		Assert.assertEquals(status, true);	
	}
	@AfterClass
	void tearDown()
	{
		driver.quit();
	}
}
