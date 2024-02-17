import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes_1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/guru99home/");
	   WebElement frame=driver.findElement(By.id("a077aa5e"));
	   driver.switchTo().frame(frame);
	   driver.findElement(By.xpath(("html/body/a/img"))).click();
	   System.out.println("We have done the frames");
	   driver.switchTo().defaultContent();
	   driver.quit();

	}

}
