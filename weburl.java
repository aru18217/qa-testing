import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DemoblazeTest {
    WebDriver driver;

    @BeforeClass
    public void setup() {
        // Path to chromedriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoblaze.com/");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
