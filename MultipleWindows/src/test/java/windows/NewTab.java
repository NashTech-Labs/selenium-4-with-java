package windows;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class NewTab {
    @Test
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/test/chromedriver_linux64/chromedriver");
        // Launch Chrome
        WebDriver driver = new ChromeDriver();
        // Maximize Window
        driver.manage().window().maximize();
        // Delete all Cookies
        driver.manage().deleteAllCookies();
        // Waits
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.knoldus.com/home");
        String s = Keys.chord(Keys.CONTROL, Keys.ENTER);
        driver.findElement(By.xpath("//a[@class='elementor-button-link elementor-button elementor-size-md elementor-animation-float']")).sendKeys(s);
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> it = windows.iterator();
        String parent = it.next();
        String child = it.next();
        driver.switchTo().window(child);
        driver.findElement(By.xpath("//div[@class='calendly-badge-widget']")).click();
        driver.switchTo().window(parent);
        driver.quit();
    }
}