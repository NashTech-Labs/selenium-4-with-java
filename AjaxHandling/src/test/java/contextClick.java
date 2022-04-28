import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

    public class contextClick {
        public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "/home/knoldus/Downloads/Ajax handling/browser driver/chromedriver_linux64/chromedriver");

            WebDriver driver = new ChromeDriver();

                // Navigate to Url
                driver.get("https://google.com");

                // Store 'google search' button web element
                WebElement search = driver.findElement(By.linkText("Sign in"));
                Actions context = new Actions(driver);
                // Perform context-click action on the element
                context.contextClick(search).build().perform();

            driver.quit();
            }

    }

