import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class moveByOffset {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/home/knoldus/Downloads/Ajax handling/browser driver/chromedriver_linux64/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        try {
            // Navigate to Url
            driver.get("https://google.com");

            // Store 'Gmail' anchor web element
            WebElement gmailLink = driver.findElement(By.linkText("Gmail"));
            // Capture x and y offset positions of element
            int xOffset = gmailLink.getRect().getX();
            int yOffset = gmailLink.getRect().getY();
            Actions actionProvider = new Actions(driver);
            // Performs mouse move action onto the offset position
            actionProvider.moveByOffset(xOffset, yOffset).build().perform();
        } finally {
            driver.quit();
        }
    }
}
