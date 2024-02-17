package Java_2024;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://google.com");
	    WebElement search=driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
	    search.sendKeys("selenium");
	   List<WebElement> all=driver.findElements(By.xpath("//div[@class='wM6W7d']/span"));
	    System.out.println(all.size());
	    for(int i=0;i<all.size();i++)
	    {
	     System.out.println(all.get(i).getText());
	    }	
	}

}
