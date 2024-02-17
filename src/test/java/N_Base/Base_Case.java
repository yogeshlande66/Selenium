package N_Base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Base_Case {
	
	Base b;
    WebDriver driver;
    Properties prop;
	 
	
    @Test
    public void get()
    {
    	b=new Base(driver,prop);
    	b.Init();
     
    }
	
	
     

}
