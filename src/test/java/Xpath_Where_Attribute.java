import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Where_Attribute {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://m.facebook.com/login/?refsrc=deprecated&_rdr");
		WebElement element=driver.findElement(By.xpath("//input[@name='email']"));
		element.sendKeys("ddhdghdgfjg");
		WebElement element1=driver.findElement(By.xpath("//input[@name='pass']"));
		element1.sendKeys("admin");
		System.out.println("The title of page: "+ driver.getTitle());
		System.out.println("The current url of the page:" +driver.getCurrentUrl());
		WebElement element2=driver.findElement(By.xpath("//button[@name='login']"));
	
		if(element.equals(element1))
		{
			element2.click();
			System.out.println("The account login sucessfully:"+driver.getTitle());
			
		}
		else
		{
			WebElement forget=driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
			forget.click();
		
			System.out.println(driver.getTitle());
			
		
		
	
		}
		
	//	System.out.println("The after click on the subit button:" +driver.getTitle());
	
		
 
		
		
	    driver.close();
		
		
		
	

	}

}
