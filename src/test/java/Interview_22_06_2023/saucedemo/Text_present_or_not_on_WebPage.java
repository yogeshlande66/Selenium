package Interview_22_06_2023.saucedemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Text_present_or_not_on_WebPage {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		 driver.get("https://google.com");
	//	driver.get("https:www.cricinfo.com");
		   
		 String s=driver.getPageSource();
		 System.out.println(s.contains("Google"));
		
		driver.quit();
		
		
	
		
	
		
	
	}

}
