import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://globalsqa.com/demo-site/select-dropdown-menu/");
		WebElement drop=driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//p//select"));
		Select sel=new Select(drop);
		//sel.selectByIndex(1);
     //   sel.selectByValue("AIA");
		List<WebElement> elementCoun=sel.getOptions();
		System.out.println("The drpdown sucessfully selected"+elementCoun);
		driver.quit();

      
		

	}

}
