import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Propperties {
	public WebDriver driver;
	@Test
public void readFile() throws IOException
{
	Properties pro=new Properties(); 
	FileInputStream file=new FileInputStream("C:\\Users\\ADMIN\\eclipse-workspace\\Selenium\\src\\main\\java\\config\\config.properties");
	
    pro.load(file);
    System.out.println(pro.getProperty("username"));
    System.out.println(pro.getProperty("password"));  
    System.out.println(pro.getProperty("url"));
    driver=new ChromeDriver();
    driver.get(pro.getProperty("url"));
    TakesScreenshot scrShot =((TakesScreenshot)driver);
   File f= scrShot.getScreenshotAs(OutputType.FILE);
   FileUtils.copyFile(f,new File("F://yogesh.jpg")); 

   
   
    
    
    System.out.println(driver.getTitle());
    
    driver.quit();
  
    
    
  
     
  
  
    
    
  //  System.out.println(pro.getProperty(""));  
    
	
		
		

}
}

