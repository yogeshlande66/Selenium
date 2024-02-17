package Java_2024;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import dev.failsafe.Timeout;

public class Alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(40));
		//driver.get("https://demo.automationtesting.in/Alerts.html");
	//    Assert.assertEquals("Alerts",driver.getTitle());
		/*
		 *Alert with ok buuton
		 *
		driver.findElement(By.xpath("//a[normalize-space()='Alert with OK']")).click();
		//a[normalize-space()='Alert with OK & Cancel']wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[contains(text(),'click the button to display an')]"))));
		driver.findElement(By.xpath("//button[contains(text(),'click the button to display an')]")).click();
		driver.switchTo().alert().accept(); */
		
	/*	
		// Alert with cancel button
	   driver.findElement(By.xpath("//a[normalize-space()='Alert with OK & Cancel']")).click();
	   wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[normalize-space()='click the button to display a confirm box']"))));
	   driver.findElement(By.xpath("//button[normalize-space()='click the button to display a confirm box']")).click();
	   driver.switchTo().alert().dismiss();
	   */
		
		// Alert With text box
		/* driver.findElement(By.xpath("//a[normalize-space()='Alert with Textbox']")).click();
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[normalize-space()='click the button to demonstrate the prompt box']"))));
		driver.findElement(By.xpath("//button[normalize-space()='click the button to demonstrate the prompt box']")).click();
	    driver.switchTo().alert().sendKeys("");
	    driver.quit();
		*/
		//  Alert With Authentication
		
	driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	String text=  driver.findElement(By.xpath("//h3[normalize-space()='Basic Auth']")).getText();
	System.out.println(""+text);
	driver.quit();
	
	

	}

}
