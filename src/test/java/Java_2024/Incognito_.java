package Java_2024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Incognito_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions option=new ChromeOptions();
	     option.addArguments("--incognito");
	     
	   WebDriver driver=new ChromeDriver(option);
	    driver.get("https://google.com");
	    driver.close();
	}

}
