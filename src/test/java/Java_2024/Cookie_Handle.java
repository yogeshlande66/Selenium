package Java_2024;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Cookie_Handle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(100));
		driver.get("https://demo.nopcommerce.com/");
	Set<Cookie>	cookies=driver.manage().getCookies();
	//System.out.println("All Cookes"+cookies.size());
	for(Cookie cook:cookies)
	{
		System.out.println(cook.getName()+"\n"+cook.getValue());	
		Cookie  ck=new Cookie("ydfd55","j888747");
		driver.manage().addCookie(ck);
	}
	System.out.println("All Cookes"+cookies.size());
	driver.quit();
	}
}