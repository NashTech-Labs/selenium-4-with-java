package com;

import constant.ConstantFile;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class DriverUtility {
    static WebDriver driver;

    private DriverUtility() throws Exception {
        System.setProperty("webdriver.chrome.driver", "chromedriver");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless"); //for headless mode
        options.addArguments("--window-size=800,600");
        options.addArguments("--remote-debugging-port=9222");
        options.addArguments("start-maximized"); // open Browser in maximized mode
        options.addArguments("disable-infobars"); // disabling infobars
        options.addArguments("--disable-extensions"); // disabling extensions
        options.addArguments("--disable-gpu"); // applicable to windows os only
        options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
        options.addArguments("--no-sandbox");

        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }

    public boolean performTest(SheetColumnHeader sheetColumnHeader) {
        try {


            driver.get(ConstantFile.URL);
            System.out.println("**Launching Chrome Browser**");

            //handle first name field
            driver.findElement(By.cssSelector(ConstantFile.First_Name)).sendKeys(sheetColumnHeader.getFirstname());
            //handle last name field
            driver.findElement(By.cssSelector(ConstantFile.Last_Name)).sendKeys(sheetColumnHeader.getLastname());
            //handle number field
            takeScreenshot("Screenshot");
            if (sheetColumnHeader.getGender().equals("male")) {
                driver.findElement(By.xpath(ConstantFile.Male_Gender)).click();
            } else {
                driver.findElement(By.xpath(ConstantFile.Female_Gender)).click();
            }

            //handle number field
            driver.findElement(By.cssSelector(ConstantFile.Number)).sendKeys(String.valueOf(sheetColumnHeader.getNumber()));


            Thread.sleep(2000);
            //handle send button
            driver.findElement(By.cssSelector(ConstantFile.Button)).submit();
            //display all details form
            driver.findElement(By.cssSelector(ConstantFile.Display_Screen)).isDisplayed();
            Thread.sleep(2000);
        } catch (Exception p) {
            return false;
        }
        return true;

    }

    public void shutdownDriver() {

        driver.quit();

        //driver.close();
        System.out.println("I am closing Browser ");
    }

    public static void takeScreenshot(String filename) throws IOException {
        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File(System.getProperty("user.dir") + "/test-output/Screenshot/" + filename + ".png"));

    }

    public static DriverUtility getInstance() throws Exception {
        return new DriverUtility();
    }

}
