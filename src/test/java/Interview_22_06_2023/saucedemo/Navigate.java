package Interview_22_06_2023.saucedemo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 WebDriver driver=new ChromeDriver();

	 driver.get("https:google.com");
	 driver.get("https://youtube.com");
	  driver.navigate().back();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   
	 driver.navigate().forward();
	 driver.navigate().to("https://amazon.com");
	 driver.navigate().refresh();
	 
	 
	 driver.quit();
	 
	 

	}

}
