package POM_2024;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Waits.JsonReader_1;

public class BaseClass {
	 WebDriver driver;
	public WebDriverWait wait;
	public HomePage Hp;
	public BrowserSignUp sup;
	JsonReader_1 reader;
	@BeforeTest
	public void setup()
	{
     driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     driver.get("https://www.browserstack.com/users/sign_in");	
	}

	@Test(priority = 1)
	public void VerifyHeader_Click_HomePage()
	{
		try
		{
		Hp=new HomePage(driver);
        Hp.verifyHeader();
        Hp.SignUpClick();
		}
		catch(NoSuchElementException e)
		{
			System.out.print(e);
			}
		}
@Test(priority=2)
public void EnterDataForLoginPage()
{
	sup=new BrowserSignUp(driver);
	sup.EnterUsername("dsdsdgshsh");
	sup.EnterPassword(reader.toString());
	sup.LoginClick();
}
@AfterTest
 void tearDown()
 {
	driver.quit();
 }
	
}

