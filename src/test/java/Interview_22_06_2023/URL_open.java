package Interview_22_06_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class URL_open {

	public static void main(String[] args) {
	 
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.nopcommerce.com/en/login?returnUrl=%2Fen");
	//	driver.get("https:/youtube.com");
     /*    System.out.println("Title of the page:" +driver.getTitle());
         System.out.println("The url of the webpage:-"+ driver.getCurrentUrl());
         System.out.println("The page Source of the page: "+driver.getPageSource());*/
		WebElement element=driver.findElement(By.xpath("//label[normalize-space()='Remember me?']"));
		element.isDisplayed();
		
	System.out.println("The displaying :- "+ element.isDisplayed());
	System.out.println(""+element.isSelected());
	System.out.println(""+element.isEnabled());
	System.out.println("https://google.com");
	
         
		
		
	}

}
 

