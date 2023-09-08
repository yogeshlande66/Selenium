package Interview_22_06_2023;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://jqueryui.com/");
	    JavascriptExecutor js=(JavascriptExecutor) driver;
	   // Scroll by pixel
	   js.executeScript("window.scrollBy(0,100)","");

	}

}
