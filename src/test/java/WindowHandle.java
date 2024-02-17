import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		 driver.manage().window().maximize();
		 driver.get("https://www.naukri.com/");
		 
		 String parent=driver.getWindowHandle();
		 
		 Set<String>set=driver.getWindowHandles();
		
		driver.close();
		
		

	}

}
