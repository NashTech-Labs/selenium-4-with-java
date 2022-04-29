import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeys {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/home/knoldus/Downloads/KeyboardActions/browser driver/chromedriver_linux64/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {

// Navigate to the url
            driver.get("https://google.com");

// Create an object of Action class
            Actions action = new Actions(driver);

// Find google search box element
            WebElement search = driver.findElement(By.name("q"));

// Send value by action class to the search box
            action.sendKeys(search, "Selenium").perform();

// Perform Keyboard action by Action class
            action.sendKeys(Keys.ENTER).perform();

        } finally {
            driver.quit();
        }

    }
}