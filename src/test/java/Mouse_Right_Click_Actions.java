import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Right_Click_Actions {
	public static void main(String args[])
	{
		WebDriver driver=new ChromeDriver();
		
	/* driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
	WebElement input=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
	
   *-----Perform the right click action on mouse------*
	 Actions act=new Actions(driver); // Action class is used to perfoem all action on mouse
	act.contextClick(input).perform(); // contetClick()- Method  is used to right click through mouse   
	*/
		
		// *---Perfoem double click action------
		
 /* driver.get("https://www.w3schools.com//jquery/tryit.asp?filename=tryjquery_event_dblclick");
 driver.manage().window().maximize();
// WebElement input=driver.findElement(By.xpath("//p[normalize-space()='Double-click on this paragraph.']"));
 
 driver.switchTo().frame("iframeResult");
 WebElement input=driver.findElement(By.xpath("//p[normalize-space()='Double-click on this paragraph.']"));
 
 Actions act=new Actions(driver);
act.doubleClick(input).perform();		// doubleClick() used to double click on mouse  */
		
		
	/*	// Drag & Drop element
		// driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml5_draganddrop");
		 driver.get("https://the-internet.herokuapp.com/drag_and_drop");
		 driver.manage().window().maximize();
		 
		 //driver.switchTo().frame("iframeResult");
		WebElement input=driver.findElement(By.id("column-a"));
		WebElement input1=driver.findElement(By.id("column-b"));	
		Actions act=new Actions(driver);
	    act.dragAndDrop(input, input1).perform();   */
		
		//----mose hover opration
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		WebElement destop=driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
		WebElement mac=driver.findElement(By.xpath("//a[@class='nav-link'][normalize-space()='Mac (1)']"));
		
	    Actions act=new Actions(driver);
	   act.moveToElement(destop).moveToElement(mac).click().perform(); // HMouse hover opration can be perfom by usin moveToElement method
	   driver.close();
	   
	 
		
		 
				
				 
		 
		 
		
		

	
	
	
	
		
	}
	
}
