package Waits;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class select_1 {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		/*driver.get(" https://www.testandquiz.com/selenium/testing.html");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(2000));
		
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
	  wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy());
		WebElement web=driver.findElement(By.xpath("//select[@id=country_code']"));
		Select sel=new Select(web);
		List<WebElement> list=sel.getOptions();
		int i=list.size();
		System.out.println(i);*/
		driver.get("https://www.browserstack.com/");
		Actions action = new Actions(driver); 
		WebElement element= driver.findElement(By.linkText("Get started free"));

		action.moveToElement(element).click();
		
	
	//	https://www.browserstack.com/
		
		
		

	
	  
		
		
		 //Select  sel=new  Select ();
	
		
		
		

	}

}
