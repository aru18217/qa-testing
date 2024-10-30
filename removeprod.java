public class RemoveFromCartTest extends DemoblazeTest {

    @Test
    public void removeFromCart() throws InterruptedException {
        // Navigate to cart
        driver.findElement(By.id("cartur")).click();
        Thread.sleep(2000);
        
        // Delete product
        driver.findElement(By.xpath("//a[contains(text(),'Delete')]")).click();
        
        // Optional assertion to check if the cart is empty
        Thread.sleep(2000);
        assert driver.findElements(By.xpath("//td[contains(text(),'Samsung galaxy s6')]")).isEmpty();
    }
}
