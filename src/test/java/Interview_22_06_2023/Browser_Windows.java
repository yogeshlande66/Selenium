package Interview_22_06_2023;

import java.awt.List;
import java.util.ArrayList;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Browser_Windows {
 public static void main(String args[])  
 {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html"); //  open first window
	  String parent= driver.getWindowHandle(); // used to get th id of single browser
	  System.out.println(parent);
	  driver.findElement(By.xpath("//button[@id='newWindowBtn']")).click(); // Open another window
	  Set<String> child=driver.getWindowHandles(); // Return the multiple window id's
	  java.util.Iterator<String> itr=child.iterator();  // Iterator used to iterator the more than one element
	  
	  // Used to store the id of the element 
	   String id= itr.next(); 
	   String id1=itr.next();
	   System.out.println("parent browser id's"+id);
	   System.out.println("Child browser id's"+id1);
	   
  driver.switchTo().window(id1); //Used to switch the another window and capture the id's 
/*  System.out.println("Title page of parent window"+driver.getTitle());
//  driver.switchTo().window(id1);
   driver.switchTo().window(id1);
   System.out.println("Child window title"+driver.getTitle());*/
 /* for(String s:child)
  {
	String title=driver.switchTo().window(s).getTitle();
    System.out.println("Page of the titile"+title);
    
  }*/
   
  //driver.quit(); 
  // Used TO CLOSE THE Specific window
  for(String s:child)
  {
	  String title=driver.switchTo().window(s).getTitle();
	  if(title.equals("Window Handles Practice - H Y R Tutorials"));
	  {
		  driver.close();
	  }
	 
  }
  

	   
	  
	  //driver.get("https://google.com");    // open first window
	  
	 // driver.findElement(By.xpath("//a[@href='https://www.facebook.com/OrangeHRM/']//*[name()='svg']//*[name()='g' and contains(@fill,'currentCol')]//*[name()='path' and contains(@class,'st0')]")).click();
	  
		
	  
	/* driver.getWindowHandle(); //- Used to get the id of single browser window
	  //getWindowHandles:-  Used to get the id's of the multiple browser window's
	   String  id=driver.getWindowHandle();
	   System.out.println(id);
	  driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")).click(); //Open onther window 
	  
	  
	  
	  // open the another window
	  Set<String> id1=driver.getWindowHandles(); // Return the  id's of the 
	  java.util.Iterator<String> itr=id1.iterator();
	   String parent_id=itr.next();
	   String Child_id=itr.next();
	   System.out.print(parent_id+""+Child_id);
	   
	   java.util.List itr1=new ArrayList(id1);
	   itr1.indexOf(0);
	   itr1.indexOf() */
  
	   
	  
	   
//	  driver.quit();
	     }

}
