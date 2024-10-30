import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SignUpTest extends DemoblazeTest {

    @Test
    public void signUp() throws InterruptedException {
        driver.findElement(By.id("signin2")).click();
        Thread.sleep(2000);  // Waiting for modal to appear
        
        // Locate input fields and button
        WebElement username = driver.findElement(By.id("sign-username"));
        WebElement password = driver.findElement(By.id("sign-password"));
        WebElement signUpButton = driver.findElement(By.xpath("//button[contains(text(),'Sign up')]"));
        
        // Perform actions
        username.sendKeys("newUser123");
        password.sendKeys("password123");
        signUpButton.click();
        
        // Optionally, add assertion for sign-up success
        Thread.sleep(3000);  // Waiting for any alert message
        driver.switchTo().alert().accept();
    }
}
