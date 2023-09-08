import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_sel {
	public static void main(String args[])
	{
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
	/*driver.get("https://www.browserstack.com/users/sign_in");
	driver.findElement(By.id("user_email_login")).sendKeys("yodffggg");
		   driver.findElement(By.id("user_password")).sendKeys("dsgsgss");
		   driver.findElement(By.id("user_submit")).click();   */
		 
		//driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		 driver.get("https://demo.guru99.com/test/radio.html");
	//	 WebElement str=driver.findElement(By.xpath("//input[@id='vfb-7-1']"));
	     //WebElement str2=driver.findElement(By.xpath("//input[@id='vfb-7-2']"));
		// str.click();
	//	str.click();
	//	System.out.println(str.isSelected());
	//	System.out.println(str.isSelected());
		/*if(str.isSelected() && str2.isSelected())
		{
		 System.out.println("test pass");
		}
		else
		{
			System.out.println("test scrip faiLED");
		}no
		*/
		 
		 WebElement web=driver.findElement(By.xpath("//input[@id='vfb-6-0']"));
		for(int i=0;i<2;i++)
		{
			web.click();
			System.out.println(web.isSelected());
			
			
		}
		 
				 
		
		 
		 driver.close();
	
	
		  
		 
		 
		 

	//System.out.println(driver.getTitle());
	//System.out.println(driver.getCurrentUrl());
  





	
	
    // driver.quit();
     
		   
		   
		   
		   
		  
		 
	}

}
