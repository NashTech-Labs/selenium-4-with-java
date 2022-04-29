import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyUp {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/home/knoldus/Downloads/KeyboardActions/browser driver/chromedriver_linux64/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {
            // Navigate to Url
            driver.get("https://google.com");
            Actions action = new Actions(driver);

            // Store google search box WebElement
            WebElement search = driver.findElement(By.name("q"));

            // Enters text "knoldus" with keyDown SHIFT key and after keyUp SHIFT key (KNOLDUSknoldus)
            action.keyDown(Keys.SHIFT).sendKeys(search,"knoldus").keyUp(Keys.SHIFT).sendKeys("knoldus").perform();
        } finally {
            driver.quit();
        }
    }
}
