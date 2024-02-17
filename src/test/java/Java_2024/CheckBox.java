	package Java_2024;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		//driver.get("https://artoftesting.com/samplesiteforselenium");
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_input_type_checkbox");
		driver.switchTo().frame("iframeResult");
      //  WebElement element=driver.findElement(By.xpath("//input[@type='checkbox' and contains(@id,'vehicle')]"));
  /*   List<WebElement> list=driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'vehicle')]"));
     System.out.println("Size of the checkbox:"+list.size());
     int size=list.size();
     for(int i=0;i<size;i++)
     {
    	list.get(i).click();
     }
     Assert.assertTrue(true,"Checkboxes sucesfully clicked");   */
  WebElement vehicle=driver.findElement(By.xpath("//input[@id='vehicle2']"));
  vehicle.click();
  if(vehicle.isSelected()==true)
  {
	  vehicle.click();

	  System.out.println("Sucessfully Deselected");
	 
  }
  else
  {
	  System.out.println("Sucessfully  selected");
  }
       
       driver.quit();
  
			
	}

}
