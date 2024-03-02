package TestNg_LoginProject;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import jdk.jfr.Timespan;

public class KeyboardAction {

	WebDriver driver;
	WebDriverWait wait;
	
    @BeforeTest
    public void setup()
    {
       driver=new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
       wait=new WebDriverWait(driver,Duration.ofSeconds(10));
       driver.manage().window().maximize();
       driver.get("https://www.naukri.com/");
   
    }
    @Test
    public void windowHandle()
    {
     String parentWindow=driver.getWindowHandle();
     driver.navigate().refresh();
    WebElement remote= driver.findElement(By.xpath("//span[text()='Remote']"));
    wait.until(ExpectedConditions.elementToBeClickable(remote));
    remote.click();
    
    
     Set<String> windows=driver.getWindowHandles();
     Iterator<String> itr=windows.iterator();
     while(itr.hasNext())
     {
    	 String childWindow=itr.next();
    	 if(!parentWindow.equals(childWindow))
    	 {
    	 driver.switchTo().window(childWindow);
    	// driver.switchTo().frame(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]")));
    	 WebElement aws=driver.findElement(By.xpath("//a[normalize-space()='Aws Developer']"));
    	 driver.switchTo().frame(aws);
    	 wait.until(ExpectedConditions.elementToBeClickable(aws));
    	 aws.click();  	 
    	 driver.close();
    	// driver.close(); //body/div[@id='root']/div[@class='styles_srp-container__BXVFt styles_srp-container--extra__hiLD3']/main[@id='search-result-container']/div[@class='styles_srpc__content__h6cyr']/div[@id='listContainer']/div[@class='styles_job-listing-container__OCfZC']/div[@class='styles_jlc__main__VdwtF']/div[1]/div[1]/div[1]
    	 }
    	 driver.switchTo().window(driver.getTitle());
    	 String titile=driver.getTitle();
    	 Assert.assertEquals(titile,"Aws Developer - Pune - Bangalore Strategic Solutions - 4 to 5 years of experience");
    	 driver.close();
    	 driver.switchTo().window(parentWindow);
    	 String parentStatus=driver.getTitle();
    	 Assert.assertEquals(parentStatus,"Jobs - Recruitment - Job Search -  Employment - Job Vacancies - Naukri.com");
     }
     
    }
}
