import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        try {
            // Navigate to Url
            driver.get("https://crossbrowsertesting.github.io/drag-and-drop");
            // Store 'box A' as source element
            WebElement sourceEle = driver.findElement(By.id("draggable"));
            // Store 'box B' as source element
            WebElement targetEle = driver.findElement(By.id("droppable"));
            Actions actionProvider = new Actions(driver);
            // Performs drag and drop action of sourceEle onto the targetEle
            actionProvider.dragAndDrop(sourceEle, targetEle).build().perform();
        } finally {
            driver.quit();
        }
    }
}
  
