import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class ActionsDoubleClickDemo {

        public static void main(String[] args) {

            System.setProperty("webdriver.chrome.driver", "/home/knoldus/Downloads/Ajax handling/browser driver/chromedriver_linux64/chromedriver");

            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.get("https://www.google.com/");

            //Double click on element

            Actions action = new Actions(driver);

            WebElement webElement=driver.findElement(By.linkText("Sign in"));
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

            action.doubleClick(webElement).perform();

            driver.close();

        }

    }

