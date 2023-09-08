package Interview_22_06_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear_text_from_input_box {
	public static void main(String args[])
	{
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2Fn");
     
     //Clear the text from input box using clear method
       WebElement input=driver.findElement(By.id("Email"));
      // input.clear();
      // input.sendKeys("fggshfghd");
      // driver.close();
     //  input.clear();
    //  System.out.println(input.getAttribute("value")); // Used to rturn the value of value attibute  and also retirn the value is showing on lables
      //Used to return the value associated with locator
   //   System.out.println(driver.getTitle());
     // System.out.println(driver.getCurrentUrl());
      //System.out.println(driver.getClass());
     //Text method getting the value of innerText 
    // String s=input.getText(); // Used to geth the value of the innerText
    // System.out.println(s);
     
     //Capture the attribute value using getAttribute() method
     /* WebElement button=driver.findElement(By.xpath("//button[normalize-space()='Log in']"));
  System.out.println(button.getAttribute("type"));
   System.out.println(button.getAttribute("class"));
     System.out.print(button.getText()); */
    String text=driver.findElement(By.xpath("//h1[normalize-space()='Admin area demo']")).getText();
     System.out.println(text);     
     driver.close();

     
     

	}

}
