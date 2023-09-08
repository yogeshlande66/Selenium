package Interview_22_06_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
	public static void main(String args[])
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/checkbox");
		WebElement web=driver.findElement(By.xpath("//span[@class='rct-checkbox']"));
	 web.click();
		
	System.out.println(web.isSelected());
	System.out.println(web.isDisplayed());
	System.out.println(web.isEnabled());

	
	driver.close();
	
	


		
	}

}
