package Java_2024;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WindowHandle_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String s=driver.getWindowHandle();
		System.out.println(s.length());
	
		driver.get("https://www.way2automation.com/lifetime-membership-club/#");
		WebElement element=driver.findElement(By.xpath("//a[@aria-label='Facebook']//span[@class='ahfb-svg-iconset ast-inline-flex svg-baseline']//*[name()='svg']"));
		element.click();
		String title=driver.getTitle();
		String Expected="Lifetime Membership Club | Free Selenium, Webservices Tutorials";
        Assert.assertNotNull(Expected);	
		driver.quit();
	}

}
