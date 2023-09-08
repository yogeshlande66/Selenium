package Interview_22_06_2023;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {

	public static void main(String[] args) {
		
		// Lauch the browser
		WebDriver driver=new ChromeDriver();
	   // WebDriver driver1=new FirefoxDriver();
	    driver.get("https://facebook.com");
	    
		// System.setProperty("webdriver.chroe.driver","C:\\Program Files\\Java\\Seleniu\\chromedriver.exe");
		
		driver.get("https://google.com");
		
		System.out.println(driver.getPageSource());
		System.out.println(driver.getTitle());
		System.out.println("Current Url of the page:- "+driver.getCurrentUrl());
		
	
		driver.close();
		
		
		
	 

	}

}
