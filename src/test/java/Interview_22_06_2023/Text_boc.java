package Interview_22_06_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Text_boc {
public static void main(String args[])
{
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://demoqa.com/checkbox");
	WebElement web=driver.findElement(By.xpath("//div[@id='app']//div[@class='container playgound-body']//div[1]//div[1]//div[1]//div[1]//span[1]//div[1]//div[1][1]//span[1]//*[name()='svg']"));
	 web.click();
	 driver.findElement(By.xpath("//span[normalize-space()='Text Box']")).click();
	 driver.findElement(By.id("userName")).sendKeys("dssgsgsg");
	 driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("dssgsgsg");
	 driver.findElement(By.id("currentAddress")).sendKeys("dssgsgsg");

	
}
}
