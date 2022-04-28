package TakeScreenshot;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
public class Section {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "src/test/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.knoldus.com/connect/contact-us");
        WebElement pageSection = driver.findElement(By.xpath("//*[contains(@alt, 'Banner')]"));
        File src = pageSection.getScreenshotAs(OutputType.FILE);
        File target = new File("Banner.png");
        FileUtils.copyFile(src, target);
        driver.close();
    }
}