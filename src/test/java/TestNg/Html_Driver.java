package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Html_Driver {
	static WebDriver driver;

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
			try {
				driver=new HtmlUnitDriver();
			//	driver.get("https://google.com");
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();	
			}
	}

}
