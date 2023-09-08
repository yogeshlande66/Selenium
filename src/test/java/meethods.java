import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class meethods {
	public static void main(String args[]) throws InterruptedException
	{
		//Methods:
		//get mwthod,conditonal method ,navigation method,browser mwthod, wait method
		
		WebDriver driver=new ChromeDriver();
		
		//get url
	 driver.get("https://demo.nopcommerce.com/"); //register
	 driver.manage().window().maximize();
	 //  Get Title()
	//System.out.println(driver.getTitle());
//	System.out.println("Get Current url:"+driver.getCurrentUrl());
	//System.out.println("Page Source:"+driver.getPageSource());
	
   //WebElement logo =driver.findElement(By.xpath("//img[@alt='Google']"));
	// boolean status=driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed();
	 //System.out.println(""+status);
	//System.out.println(""+logo.isDisplayed());
			//getWindowHandle()
//	System.out.println(driver.getWindowHandle());//DFB8AC90ECFA1C89C14746F5B7BF20AD	-- Access through the driver instance 
/*	driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnI']")).click();
	Thread.sleep(10);
	Set <String> window=driver.getWindowHandles();
//System.out.println(driver.getWindowHandles());
	for(String wind:window)
	{
		System.out.println(""+wind);
	} */

	//Conditionalcoomands:- 1)isDisplayed(),2)isEnable(),isSelected();-Access through the webElement instance 
	//isDisplayed();
	//WebElement enb=driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
	//System.out.println(""+enb.isEnabled());
	
	 //isEnabled
	/* gender-female WebElement sel=driver.findElement(By.xpath("//input[@id='gender-female']"));
	   sel.click();
	   boolean s=sel.isSelected();
	   
	  System.out.println(s);
	  */
	 
	  //Browsr method
	 //eg- close(),quit(),
	 // driver.findElement(By.linkText("Books")).click();
// System.out.println()
	
	 //Wait method -While getting some exception and ,solve to synchronization problem
	 // 1)implicit wait(),explicite wait// fluent()
	 
	
 driver.close();	
	
	
		
		
		
	}

}
