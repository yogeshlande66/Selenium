package Utility_DataDriver;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Base_Class {

	public WebDriver driver;
	Utility util;
	
	@BeforeMethod
	 public void InitiateDriverInstance() throws IOException
	 {
		 if(Utility.fetchPropertyValue("browserName").toString().equals("chrome"))
		 {
		//Initiate The driver Instance
			  driver=new ChromeDriver();
			
			  driver.manage().window().maximize();
	 		 }
		 
			 driver.get(util.fetchPropertyValue("appURL").toString());
		 
		 
	 }
	@AfterMethod
	 public void CoseBrowser() {
		 driver.close();	
		 
	 }
		
		


}
	 