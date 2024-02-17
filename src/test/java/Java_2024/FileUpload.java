package Java_2024;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.google.common.io.Files;

public class FileUpload {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stube
		WebDriver driver=new  ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	/*	driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		WebElement File=driver.findElement(By.xpath("//input[@type='file']"));
		
		File.sendKeys("F:\\yogesh_1.txt");
	    TakesScreenshot screenshot=((TakesScreenshot)driver);
	    File file=screenshot.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(file,new File("F:\\yogesh.png"));
		Assert.assertTrue(true,"Sucessfully file is  uploadeded");
		*/
		
		// Upload File Using the AutoIt Tool
		 driver.get("file:///C:/Users/ADMIN/OneDrive/Desktop/FileUpload.html");
		// wait.until(ExpectedConditions.elementToBeClickable( driver.findElement(By.xpath("//input[@type='file']"))));
		 driver.findElement(By.id("1")).click();
		 Runtime.getRuntime().exec("C:\\Users\\ADMIN\\OneDrive\\Desktop\\Upload.exe");
		 System.out.println("File Sucessfully uploaded");
		 
		 driver.quit();
	}

}
