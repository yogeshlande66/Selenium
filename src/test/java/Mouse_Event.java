import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Event {
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		 
	 //   driver.get("https://the-internet.herokuapp.com/key_presses");
	 /*   Actions act=new Actions(driver);
	    
	    act.sendKeys(Keys.ENTER).perform();
	    Thread.sleep(3000);
	     act.sendKeys(Keys.END).perform();
	     Thread.sleep(3000);
	     act.sendKeys(Keys.ADD).perform();
	      driver.close();
	
	  */
		 driver.get("https://text-compare.com");
	     WebElement input=driver.findElement(By.xpath("//textarea[@id='inputText1']"));
	     WebElement input1=driver.findElement(By.xpath("//textarea[@id='inputText2']"));
	     
	     input.sendKeys("Welcome to the selenium");
	     
	     
         //CTRL +  A
	     Actions act=new Actions(driver);
	     
	    act.sendKeys(Keys.chord(Keys.CONTROL,"a"));
	    
	     
	    
	   //  act.perform();
	     
	//     CTRL  + C
	     /* act.keyDown(Keys.CONTROL);
	      act.sendKeys("C");
	      act.keyUp(Keys.CONTROL);*/
	     
	    //  act.perform();
	      
	    
	      //  CTRL + T
	  //   act.sendKeys(Keys.TAB);
	   //  act.perform();
	     
	     // CTRL +P
	     
	    /* act.sendKeys(Keys.CONTROL);
	     act.sendKeys("V");
	     act.keyUp(Keys.CONTROL);
	     act.perform();*/
	      
	     
	    /* if(input.getAttribute("value").equals(input1.getAttribute("value")))
	    		 {
	    	 System.out.println("Test case is passed");
	    		 }
	     else
	     {
	    	 System.out.print("Test is not passed");
	     }
	     
	     */
	    
	     
	     
	    
//	   driver.close();
		
	}
	

}
