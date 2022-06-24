package DDT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class LoginClass {
    ChromeDriver driver;
    @Test(dataProvider ="testdata")
public void DemoProject( String username, String password, String result) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "src/test/chromedriver_linux64/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        // Delete all Cookies
        driver.manage().deleteAllCookies();
        // Waits
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://admin-demo.nopcommerce.com/");

        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.clear();
        emailField.sendKeys(username);

        WebElement pwdField = driver.findElement(By.id("Password"));
        pwdField.clear();
        pwdField.sendKeys(password);

        driver.findElement(By.xpath("//button")).click();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        String expected = "Dashboard / nopCommerce administration";
        String actual = driver.getTitle();

        if (result.equals("Valid")) {
            if (expected.equals(actual)) {
                driver.findElement(By.linkText("Logout")).click();
                Assert.assertTrue(true);
            } else {
                Assert.assertTrue(false);
            }
        } else if (result.equals("Invalid"))
        {
            if (expected.equals(actual))
            {
                driver.findElement(By.linkText("Logout")).click();
                Assert.assertTrue(false);
            }
            else {
                Assert.assertTrue(true);
            }
        }
        }

    @AfterMethod
    void Termination(){
        driver.quit();
    }


    @DataProvider(name = "testdata")
    public Object[][] TestDataFeed() throws InterruptedException {
        ReadExcelFile config = new ReadExcelFile("src/test/resources/DDT-DemoSheet.xlsx");
        int rows = config.getRowCount(0);
        Object[][] credentials = new Object[rows][3];

        for (int i=0;i<rows;i++){
            credentials[i][0] = config.getData(0,i,0);
            credentials[i][1]= config.getData(0,i,1);
            credentials[i][2]= config.getData(0,i,2);
        }
        return credentials;
    }
}




