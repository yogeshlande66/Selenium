package Java_2024;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hdfc.com/");
		WebElement element=driver.findElement(By.xpath("//div[@class='dropdown-active-item product-name-active']"));
		element.click();
		List<WebElement> list=driver.findElements(By.xpath("//ul[@id='productName']/li"));
		for(WebElement el:list)
		{
			System.out.println(el.getText());
			if(el.getText()=="Rural Housing Loans") {
			   el.click();
			   break;
			}
		}
	  
	}

}
