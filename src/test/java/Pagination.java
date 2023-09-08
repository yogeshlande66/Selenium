import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pagination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.opencart.com/admin/");
	//Login
WebElement username=driver.findElement(By.xpath("//input[@id='input-username']"));
username.clear();
username.sendKeys("demo");
WebElement pass=driver.findElement(By.xpath("//input[@name='password']"));
pass.clear();
pass.sendKeys("demo");
driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
driver.findElement(By.xpath("//button[@class='btn-close']")).click();
driver.findElement(By.xpath("//a[@class='parent collapsed'][normalize-space()='Customers']")).click(); 
driver.findElement(By.xpath("//ul[@id='collapse-5']//a[contains(text(),'Customers')]")).click();
	}

}
