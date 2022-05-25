import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class KeyDown {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/home/knoldus/Downloads/KeyboardActions/browser driver/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        try {
            // Navigate to Url
            driver.get("https://google.com");

            // Enter "webdriver" text and perform "ENTER" keyboard action
            driver.findElement(By.name("q")).sendKeys("webdriver" + Keys.ENTER);

            Actions actionProvider = new Actions(driver);
            Action keydown = actionProvider.keyDown(Keys.CONTROL).sendKeys("a").build();
            keydown.perform();
        } finally {
            driver.quit();
        }
    }
}
