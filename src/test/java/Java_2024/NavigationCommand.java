package Java_2024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com");
		/* driver.navigate().to("https://google.com");
		 driver.navigate().back();
		 driver.navigate().refresh();
		 driver.navigate().forward();*/
		
		 
		driver.quit();
		 
		 
		
		 

	}

}
