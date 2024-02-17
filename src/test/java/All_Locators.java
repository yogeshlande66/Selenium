import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class All_Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 WebDriver driver=new ChromeDriver();
	// driver.get("https://www.saucedemo.com/");
	 driver.get("https://www.facebook.com/login/");
	 
	
	/* WebElement element=driver.findElement(By.className("form_input")); 
	 element.sendKeys("yogesh");
	   // Selenium Does not support the multiple class name 
	   //if your class have  some spaces then selenium consider its as compound selector.
	 WebElement element1= driver.findElement(By.id("user-name"));
	 element1.sendKeys("dfsgsfs");
	  driver.findElement(By.name("user-name")).sendKeys("dffdgs");
	  */
	 
	 //*******1st Test case: with correct credentials
	/* WebElement element=driver.findElement(By.id("user-name"));
      element.sendKeys("standard_user");
      WebElement element1=driver.findElement(By.name("password"));
      element1.sendKeys("secret_sauce");
      WebElement btn=driver.findElement(By.id("login-button"));
      btn.click();
      System.out.println("Current title page:"+driver.getTitle());
      
      Assert.assertEquals(driver.getTitle(), "Swag Labs");
      System.out.println("The program login sucessfully");
      */
	 
      
      //2nd test case:- With correct username but  wrong password
	 
/*	 WebElement element=driver.findElement(By.id("user-name"));
     element.sendKeys("standard_user");
     WebElement element1=driver.findElement(By.name("password"));
     element1.sendKeys("dsgsgsgsg");
     WebElement btn=driver.findElement(By.id("login-button"));
     btn.click();
     System.out.println("Current title page:"+driver.getTitle());	*/
	// WebElement element=driver.findElement(By.cssSelector("input#user-name")); //TAg and id tagname#id
	// element.sendKeys("fdsssgsg");
	// WebElement element1=driver.findElement(By.cssSelector("input.input_error")); //	 ///TAg and class tagnam.id
//WebElement element1=driver.findElement(By.cssSelector("input[placeholder='Username']")); //tag[attributr]
	 // WebElement element2=driver.findElement(By.cssSelector("input[type='text']"));  	  
	// WebElement element2=driver.findElement(By.cssSelector("input.input_error[id='user-name']"));  //input.class[attribute value]
      //s element2.sendKeys("fgsfgsff");
	  //   element2=driver.findElement(By.cssSelector("tag:contains('')"))
	    		// WebElement	element2=driver.findElement(By.cssSelector("a:contains('Sign up for Facebook')"));
	 WebElement element=driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
	 element.click();
	 
	//
	    
   	
	    //  element2.click();
	       System.out.print(driver.getTitle());
	       //s Assert.assertEquals(driver.getTitle(), "Swag Labs");
     
     //System.out.println("The program login sucessfully");
      
	 
      
      //System.out.println("Sucessfully program run");      
	   
	   
	   
	   
	   driver.close();
	   
	   
	   
	  
	   
	   
	   
	  
	 
	 
	 
	 

	}

}
