package Java_2024;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class FileUploadBySend {

	public static void main(String[] args) {
		// TODO Auto-generated method stube
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(100));
	  driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
	  WebElement element=driver.findElement(By.xpath("//input[@name='upfile']"));
	//Uploading fil using SendKeys method
	//element.sendKeys("F:\\yogesh_1.txt");
	  
	  //Using robot class
	  JavascriptExecutor js=((JavascriptExecutor)driver);
	  wait.until(ExpectedConditions.elementToBeClickable(element));
	  js.executeScript("arguments[0].click();",element);
			  
	  
	   
	  
	  //driver.quit();
	 
	 
	}

}
