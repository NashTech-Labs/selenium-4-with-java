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

public class SingleElementTest {
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
        // Capturing Screenshots of Single Element
        driver.get("https://www.knoldus.com/connect/contact-us");
        WebElement name = driver.findElement(By.xpath("//input[@name='fullname']"));
        WebElement logo = driver.findElement(By.xpath("//div[@data-id = \"6982463\"]"));
        WebElement option = driver.findElement(By.xpath("//select"));
        elementScreenshot(name, "name");
        elementScreenshot(option, "option");
        elementScreenshot(logo,"logo");
        driver.quit();
    }
    public static void elementScreenshot(WebElement element, String Filename) throws IOException {
        File srcFile = element.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File("./target/" + Filename + ".png"));
    }
}