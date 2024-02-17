package Java_2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearaText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login");
		WebElement element=driver.findElement(By.xpath("//input[@id='Email']"));
		//element.clear();
		//element.sendKeys("yogeshLande");
		System.out.println("Get the value of the attribute:"+element.getAttribute("value"));
		 driver.quit();
	}
}
