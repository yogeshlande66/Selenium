package TestNG_POM_Project;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login__ {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
/*         Test Case_ID-101
		 * TestScenario-Verify Login Page
		 * Test Cases:-1)Valid usernme and valid pass
		 *             2)Valid username and invalid pass
		 *             3)invalid username andvalid pass
		 *             4)invalid username andinvalid password
		 *  Precondition:- Need a account to do login
		 *  Test Steps:-1)Enter username
		 *              2)Enter password 
		 *              3)click on login button
		 *             
		 *   Expected Result:Sucessfully able to login
		 
		 *   Actual Result: 
		 *   Post Condition:Gmail inbox is shown
		 *   Status:-  
 */
	 WebDriver driver=new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
	 driver.get("https://www.saucedemo.com/");
	 WebElement user=driver.findElement(By.id("user-name"));
	 user.sendKeys("standard_user");
	 
	 WebElement pass=driver.findElement(By.xpath("//input[@id='password']"));
	 pass.sendKeys("jlhjhj");
	 
	 WebElement login=driver.findElement(By.id("login-button"));
	 login.click();
     TakesScreenshot sc=(TakesScreenshot)driver;
     File f=sc.getScreenshotAs(OutputType.FILE);
     try {
		FileUtils.copyFile(f,new File("C:\\Users\\ADMIN\\eclipse-workspace\\Selenium\\fail.jpg"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    System.out.println("The title of the page"+driver.getTitle());
   driver.close();
}

}
