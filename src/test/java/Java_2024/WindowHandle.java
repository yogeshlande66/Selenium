package Java_2024;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.naukri.com/");
		//Return the parent window name as string
		String parent=driver.getWindowHandle();
		Set<String> s=driver.getWindowHandles();
		
		Iterator<String> itr=s.iterator();
		while(itr.hasNext())
		{
			String child_window=itr.next();
			if(!parent.equals(child_window))
			{
				driver.switchTo().window(child_window);
				System.out.println(driver.switchTo().window(child_window).getTitle());
				driver.close();
			}	

			}
		driver.switchTo().window(parent);	
		}
		
	}


