package Interview_22_06_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Emi_Calculator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	 driver.get("https://emicalculator.net/");
	Actions act=new Actions(driver);
	 WebElement  homeloan= driver.findElement(By.xpath("//div[@id='loanamountslider']"));
	 
	   WebElement interaterate=driver.findElement(By.xpath("//div[@id='loaninterestslider']"));
	   
	  WebElement  loantenure=driver.findElement(By.xpath("//div[@id='loantermslider']"));
	 
	act.dragAndDropBy(homeloan,88,0);
	Thread.sleep(1000);
	
	act.dragAndDropBy(interaterate,88, 0);
    Thread.sleep(1000);
    
    act.dragAndDropBy(loantenure,-88,0);
    Thread.sleep(1000);
    
    WebElement LoanEmi=driver.findElement(By.xpath("//span[normalize-space()='44,986']"));
    String s=LoanEmi.getText();
    //String s1=interaterate.getText();
    if(s.equals("1000"))
    {
    	System.out.println("test case passed");
    	
    }
    else
    {
    	System.out.println("test case not  passed");
    	
    }
    
    System.out.println("The test case is passed the sucessfully");
    
  
    
   
    
    
    
   
   driver.close();
		
	}
}
