package Java_2024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaumch {
	public static void main(String args[])
	{
		 WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://google.com");
		  System.out.println("Title of the page"+driver.getTitle());
		  System.out.println("Source of the page"+driver.getPageSource());
		  System.out.println("Url of the page"+driver.getCurrentUrl());
		  
		  driver.quit();
		  
		  
	}

}
