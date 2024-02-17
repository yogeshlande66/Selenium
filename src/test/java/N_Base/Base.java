package N_Base;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base 
{
 public  WebDriver driver;
 public  Properties prop;
 

 public Base(WebDriver driver,Properties prop)
 {
	 try
	 {
	 this.driver=driver;
	 prop=new Properties();
	 FileInputStream file=new FileInputStream("C:\\Users\\ADMIN\\eclipse-workspace\\Selenium\\src\\main\\java\\config\\config.properties");
	 prop.load(file);
	 
	 }
	 catch(Exception e)
	 {
	   System.out.println(e);
	 }
	 
 }
 public  void Init()
 {
	String s=prop.getProperty("browserName");
	 if(s.equals("chrome"))
	 
	 driver=new ChromeDriver(); 
	 
	 driver.manage().window().maximize();
	 driver.manage().deleteAllCookies();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 driver.get(prop.getProperty("url"));
 }

}
