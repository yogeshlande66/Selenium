package Interview_22_06_2023.saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new  ChromeDriver();
	 //  driver.get("https://nxtgenaiacademy.com/multiplewindows/");
	  
	   /*WebElement element=driver.findElement(By.xpath("//div[@class='elementor-element elementor-element-d5cad06 elementor-widget elementor-widget-html']//button[@id='button1']"));
	   element.click();
	   System.out.println(driver.getTitle());
	   WebElement element1=driver.findElement(By.xpath("//a[text()='Python for Automation']"));
			   element1.click();
			   System.out.println(driver.getTitle());  */
	   
	   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	      String parent=driver.getWindowHandle();

	   driver.manage().window().maximize();
	  // driver.manage().deleteAllCookies();
	 	    
	    WebElement element=driver.findElement(By.xpath("//a[text(),contains]"));
	     element.click();
	      String child=driver.getWindowHandle();


	      System.out.println(parent);
	      
	       
	    
			   
			   
			   
			   driver.quit();
			   
	   
	   
	   

	}

}

	 