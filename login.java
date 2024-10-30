public class LoginTest extends DemoblazeTest {

    @Test
    public void login() throws InterruptedException {
        driver.findElement(By.id("login2")).click();
        Thread.sleep(2000);
        
        WebElement username = driver.findElement(By.id("loginusername"));
        WebElement password = driver.findElement(By.id("loginpassword"));
        WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
        
        username.sendKeys("newUser123");
        password.sendKeys("password123");
        loginButton.click();
        
        // Assertion for successful login by checking username display
        Thread.sleep(3000);
        WebElement userDisplay = driver.findElement(By.id("nameofuser"));
        assert userDisplay.getText().contains("newUser123");
    }
}
