import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.concurrent.TimeUnit;

public class actionsDemo {

        public static void main(String[] args) {

            System.setProperty("webdriver.chrome.driver", "/home/knoldus/Downloads/Ajax handling/browser driver/chromedriver_linux64/chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.knoldus.com/home");
            ((JavascriptExecutor) driver).executeScript("scroll(0,300)");
            Actions ac = new Actions(driver);
            WebElement automate= driver.findElement(By.linkText("Services"));
            ac.moveToElement(automate).click();
            driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
            driver.close();
 }

    }
