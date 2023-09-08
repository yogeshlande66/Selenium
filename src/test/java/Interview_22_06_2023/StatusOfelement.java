package Interview_22_06_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StatusOfelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
	    WebElement search=driver.findElement(By.id("small-searchterms"));
	    System.out.println(search.isEnabled()+"\n"+search.isDisplayed());
	    
	    
	WebElement male=driver.findElement(By.id("gender-male"));
	System.out.println("Male is selected:- "+male.isSelected());
	male.click();
	System.out.println("Male is selected:- "+male.isSelected());
	WebElement female=driver.findElement(By.id("gender-female"));
	female.click();
	System.out.println("Male is selected:- "+male.isSelected());
	System.out.println("Male is selected:- "+female.isSelected());
	
	   
	  

	
	
		

	}

}
