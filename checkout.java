public class CheckoutTest extends DemoblazeTest {

    @Test
    public void checkout() throws InterruptedException {
        // Navigate to cart
        driver.findElement(By.id("cartur")).click();
        Thread.sleep(2000);
        
        // Place Order button
        driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();
        Thread.sleep(2000);
        
        // Fill in the form
        driver.findElement(By.id("name")).sendKeys("Test User");
        driver.findElement(By.id("country")).sendKeys("Indonesia");
        driver.findElement(By.id("city")).sendKeys("Jakarta");
        driver.findElement(By.id("card")).sendKeys("1234567812345678");
        driver.findElement(By.id("month")).sendKeys("12");
        driver.findElement(By.id("year")).sendKeys("2025");
        
        // Click on Purchase button
        driver.findElement(By.xpath("//button[contains(text(),'Purchase')]")).click();
        
        // Optional: capture purchase confirmation
        Thread.sleep(3000);
        WebElement confirmation = driver.findElement(By.xpath("//h2[contains(text(),'Thank you for your purchase!')]"));
        assert confirmation.isDisplayed();
    }
}
