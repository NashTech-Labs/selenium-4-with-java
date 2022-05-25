import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class clickAndHold {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/home/knoldus/Downloads/Ajax handling/browser driver/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        try {
            // Navigate to Url
            driver.get("https://google.com");

            // Store 'google search' button web element
            WebElement searchBtn = driver.findElement(By.linkText("Sign in"));
            Actions actionProvider = new Actions(driver);
            // Perform click-and-hold action on the element
            actionProvider.clickAndHold(searchBtn).build().perform();
        } finally {
            driver.quit();
        }
    }
}
