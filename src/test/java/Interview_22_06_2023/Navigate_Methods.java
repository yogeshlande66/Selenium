package Interview_22_06_2023;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_Methods {
	public static void main(String args[])
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		driver.get("https://facebook.com");
		
		driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.navigate().to("https://youtube.com");
		
		
		driver.close();
		
		
		
	}

}
