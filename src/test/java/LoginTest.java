import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.Timeout;

public class LoginTest {

    public static void main(String[] args) 
    {

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Open the login page
        driver.get("https://github.com/login");

        // Test case: Verify valid logins
        testValidLogin(driver);

       testPasswordRecovery(driver);

        // Close the browser
        driver.quit();
    }
    // Test case: Verify valid login
    public static void testValidLogin(WebDriver driver) 
    {
       String  validUsername ="yogeshlande66@gmail.com";
       String  validPassword = "Yogesh_123@";

        // Find username, password fields and login button by their IDs (replace with actual IDs)
        WebElement usernameField = driver.findElement(By.xpath("//input[@id='login_field']"));
        WebElement passwordField = driver.findElement(By.xpath("//input[@id='password']"));
        WebElement loginButton = driver.findElement(By.xpath("//input[@name='commit']"));

        // Input valid credentials and click login
        usernameField.sendKeys(validUsername);
        passwordField.sendKeys(validPassword);
        loginButton.click();

        // Wait for dashboard element after successful login
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
        WebElement dashboardElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(@class,'AppHeader-context-item')]//span[contains(@class,'')][normalize-space()='Dashboard']")));

        // Check if login is successful
        if (dashboardElement.isDisplayed()) {
            System.out.println("Login successful - Test Case 1 Passed");
        } 
        else
        {
            System.out.println("Login unsuccessful - Test Case 1 Failed");
        }
    }

   //   Test case: Password recovery
      public static void testPasswordRecovery(WebDriver driver)
      {
        WebElement forgotPasswordLink = driver.findElement(By.linkText("Forgot password?")); 

        // Click on the "Forgot Password" link
        forgotPasswordLink.click();

        // Perform actions to recover password (enter email, submit, etc.)
        WebElement Email=driver.findElement(By.xpath("//input[@id='email_field']"));
        Email.sendKeys("yogeshlande66@gmail.com");
        WebElement submitButton=driver.findElement(By.xpath("//button[@class='sc-nkuzb1-0 yuVdl button']"));
        submitButton.click();
        WebElement loginButton = driver.findElement(By.xpath("//input[@name='commit']"));
        loginButton.click();
        // Example: Checking if password recovery page sis displayed after clicking the link
        String recoveryPageTitle = driver.getTitle();
        if (recoveryPageTitle.equals("Password Recovery")) 
        {
            System.out.println("Password recovery page displayed - Test Case 2 Passed");
        } 
        else
        {
            System.out.println("Password recovery page not displayed - Test Case 2 Failed");
        }
    } 
}
