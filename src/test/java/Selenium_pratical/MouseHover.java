package Selenium_pratical;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.sun.tools.xjc.Driver;

public class MouseHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20)); 
        driver.get("https://www.browserstack.com/");
        Actions act=new Actions(driver);
        WebElement element=driver.findElement(By.xpath("//a[text()='Get started free']"));
        act.moveToElement(element).click().perform();
        WebElement checkbox=driver.findElement(By.xpath("//input[@id='tnc_checkbox']"));
        wait.until(ExpectedConditions.elementToBeClickable(checkbox));
        act.moveToElement(checkbox).click().perform();
      /*  Actions act=new Actions(driver);
        WebElement element=driver.findElement(By.xpath("//a[text()='Get started free']"));
        act.moveToElement(element).click().perform();
        WebElement username=driver.findElement(By.id("user_full_name"));
        username.clear();
        username.sendKeys("Yogesh");
        WebElement pass=driver.findElement(By.id("user_email_login"));
        pass.sendKeys("fdgsgsgs");
        WebElement pass1=driver.findElement(By.id("user_password"));
        pass1.sendKeys("dgdgdg");
        //driver.switchTo().alert().accept();
        WebElement checkbox=driver.findElement(By.xpath("//div[@class='checkbox--wrapper ']//input[@aid='tnc_checkbox']"));
        wait.until(ExpectedConditions.elementToBeClickable(checkbox));
        checkbox.click();
        WebElement login=driver.findElement(By.xpath("//div[@class='input-wrapper']//child::input[@value='Sign me up']"));
        login.click();
        driver.quit();   */
}

}
