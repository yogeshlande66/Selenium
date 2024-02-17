package Interview_22_06_2023;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https:google.com");
		System.out.println(driver.getTitle());
	    //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		 
		
		
	   WebElement web=driver.findElement(By.xpath("//img[@alt='Google']"));
	   System.out.println("The logo is displayed:"+web.isDisplayed());
	 driver.close();
		

	}

}
