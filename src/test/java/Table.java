import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {
	
	public static void main(String args[])
	{
     WebDriver driver=new  ChromeDriver();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
     //Approach_1- For multiple table
     
     driver.get("https://testautomationpractice.blogspot.com");
     driver.manage().window().maximize();
     //Finding the total no's of rows
     //Count the total no's of row in table
  // int row= driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
  //  System.out.println("no's of row"+row);
   
   /* 	//2nd Approach- Prefer when only have single table
    int row1= driver.findElements(By.tagName("tr")).size();
    System.out.println(""+row1);*/
   
     //Totala no's of column
    
    int row_3=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
    int  col= driver.findElements(By.xpath("//table[@name='BookTable']//tr//th")).size();

    //int row_4=driver.findElements(By.tagName("th")).size();

     System.out.println("no's of the column data :"+row_3);
     
     System.out.println("no's of the column data :"+col);
   //  System.out.println("no's of the column data :"+row_4);
     
     // Capture the the data from specific column and row
    //  String str=driver.findElement(By.xpath("//table[@name='BookTable']//tr[4]//td[1]")).getText();
    //  System.out.println("5th row element of "+str);
      
      // Capture the data from all row's and column
     
    // System.out.print("Total no's of Row &Column data");
     
  /*  for(int i=2;i<row_3;i++)
    {
    	for(int c=1;c<=col;c++) {
    		
    String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td["+c+"]")).getText();
    System.out.print(value+"\t");
    
    	}
    	System.out.println();
    	
    }*/
     
    //Print book name who's Author is amit
/*     for(int i=2;i<=row_3;i++)
     {
   String s= driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[2]")).getText();
   if(s.equals("Amit"))
   {
	   String td1=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[1]")).getText();
	   System.out.println(td1);
	   
   
   }
   
     }
     */
     // Find The sum of the prics
     int sum=0;
     for(int i=2;i<row_3;i++)
     {
    	String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[4]")).getText();
       sum=sum+Integer.parseInt(price);
       //System.out.print(sum);
    
     }
     System.out.println(sum);
     
 
    
      

    
     
    driver.close();
    
     
	}
}
