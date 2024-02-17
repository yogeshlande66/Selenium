package Interview_22_06_2023.saucedemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Dropdown_1 {
	 public static void main(String args[])
	 {
		 WebDriver driver=new ChromeDriver();
	/*	 driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		 WebElement element=driver.findElement(By.xpath("//select[@id='first']"));
		 
		 Select sel=new Select(element);
		 
	     sel.selectByIndex(1);
		
		  sel.selectByVisibleText("Google");
		  
	     ArrayList org=new ArrayList();
	     ArrayList temp=new ArrayList();
	     
         List<WebElement> s=sel.getOptions();
         
         for(WebElement op:s)
         {
           org.add(op.getText());
         }
         temp=org;
         Collections.sort(temp);
         
		 System.out.println("Original dropdown:"+org);
		 
		 System.out.println("Temp dropdown:"+temp);*/
		 driver.get("https://www.google.com/");
		 driver.findElement(By.xpath("//input[@name='q']")).sendKeys("selenium");
		 
     List<WebElement> list=driver.findElements(By.xpath("//li[@class='sbct']"));
     System.out.print(list.size());
    
		 
		 
		 
	 
		 
		 
		 
		 
	 }

}
