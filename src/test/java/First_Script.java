import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First_Script {

	public static void main(String args[])
	{
	/*	

    //One Way to use login method and check the login functionality with the help of  NAME Locator
	WebDriver driver=new ChromeDriver();
	driver.get("https://facebook.com");
   //driver.findElement(By.cssSelector("sc-3o0n99-5 sc-SFOxd hGFUqG")).click();
    driver.findElement(By.name("email")).sendKeys("yogesh");
   driver.findElement(By.name("pass")).sendKeys("password");
   driver.findElement(By.name("login")).click();  
	
	//To check By.id
  driver.findElement(By.name("email")).sendKeys("gfggg");
	driver.findElement(By.name("pass")).sendKeys("lande");
	driver.findElement(By.name("login")).click(); 
	driver.close();
	*/
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com");
     //	driver.quit();

   //System.out.print(driver.getTitle());

	
	}

}
