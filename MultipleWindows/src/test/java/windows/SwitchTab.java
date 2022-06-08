package windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SwitchTab {
    @Test
    public static void main(String[] args) {
        WebDriver driver;
        System.setProperty("webdriver.gecko.driver", "src/test/geckodriver-v0.30.0-linux64/geckodriver");
        // Launch Firefox
        driver = new FirefoxDriver();
        // Maximize Window
        driver.manage().window().maximize();
        // Delete all Cookies
        driver.manage().deleteAllCookies();
        // Waits
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.knoldus.com/home");
        driver.findElement(By.xpath("//a[text()='Blog']")).click();
        driver.quit();
    }
}
