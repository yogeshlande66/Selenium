package Interview_22_06_2023;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDriver {
	
 public  static Object fetchProperty( String Key) throws IOException
 {
	  FileInputStream file=new FileInputStream("./config/config.properties");
	  Properties property=new Properties();
	  property.load(file);
	  return property.get(Key);
	  
	
	  
	 
 }
 
	

}
