package Interview_22_06_2023.saucedemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		
		/*WebElement radio=driver.findElement(By.xpath("//input[@id='vfb-7-1']"));
		 radio.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement radio2=driver.findElement(By.xpath("//input[@id='vfb-7-2']"));
		radio.click();*/
		WebElement radio2=driver.findElement(By.xpath("//input[@id='vfb-6-0']"));
		
		System.out.print(radio2.isDisplayed());
		 radio2.click();
		System.out.print(radio2.isSelected());
	    radio2.click();
	    
		 

		
		
		
		 driver.quit();
			

		
	}

}

