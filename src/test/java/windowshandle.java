import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowshandle {
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
	//	driver.manage().window().maximize();
	    /*driver.get("file:///C:/Users/ADMIN/Documents/p.html");
	    System.out.println(driver.getTitle());
	    driver.findElement(By.xpath("file:///C:/Users/ADMIN/Documents/p.html")).click();
	    
	    Set<String> handle=driver.getWindowHandles();
	     Iterator<String> handle1=handle.iterator();
	     
	    String parentid=handle1.next();
	    String child_id=handle1.next();
	    
	    driver.switchTo().window(child_id);	
	    System.out.println(driver.getTitle());
	    
	    //driver.switchTo().window(parent_id);
	//    System.out.println(driver.getTitle());
	    driver.quit();
	    */
		// entering the URL
        driver.get("https://www.geeksforgeeks.org/");
 
        // to maximize the window
        driver.manage().window().maximize();
 
        // to delete all cookies
        driver.manage().deleteAllCookies();
 
        // to Scroll the screen to locate element
        JavascriptExecutor je = (JavascriptExecutor)driver;
        je.executeScript("window.scrollBy(0, 200)");
        driver.findElement(By.xpath("(// span[text()='Courses at GeeksforGeeks'])[2]")).click();
 
        // to select a particular course
        Thread.sleep(2000);
        driver.findElement(By.xpath("(// h4[text()='Data Structures and Algorithms - Self Paced'])[1]")).click();
 
        // it will open with new tab
 
        // to click on (Read more here) on new window
        driver.findElement(By.xpath("(// a[text()='(Read more here)'])[1]")).click();
 
        // statement to understand that operation is performed on new window
        System.out.println("operation is performed on new window");
    }
}
	    
	    