package TakeScreenshot;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class SectionTest {
    @Test
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "src/test/chromedriver_linux64/chromedriver");
        // Launch Chrome
        WebDriver driver = new ChromeDriver();
        // Maximize Window
        driver.manage().window().maximize();
        // Delete all Cookies
        driver.manage().deleteAllCookies();
        // Waits
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        // Capturing Screenshot of a Section
        driver.get("https://www.knoldus.com/connect/contact-us");
        WebElement pageSection = driver.findElement(By.xpath("//*[contains(@data-id, '0aaccc4')]"));
        File src = pageSection.getScreenshotAs(OutputType.FILE);
        File target = new File("Banner.png");
        FileUtils.copyFile(src, target);
        driver.close();

    }
}
