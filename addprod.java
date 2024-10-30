public class AddToCartTest extends DemoblazeTest {

    @Test
    public void addToCart() throws InterruptedException {
        // Click on a product
        driver.findElement(By.linkText("Samsung galaxy s6")).click();
        Thread.sleep(2000);
        
        // Add to cart button
        driver.findElement(By.linkText("Add to cart")).click();
        
        // Handle alert for successful add to cart
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
        
        // Navigate back to homepage
        driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
    }
}
