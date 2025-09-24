package Key_Down;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Key_Down1 {

    public static void main(String[] args) throws InterruptedException {
        // Launch browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.instagram.com/");

        // Explicit wait for username field
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));

        username.sendKeys("myTestUser");

        // Create Actions object
        Actions actions = new Actions(driver);

        // CTRL + A (Select All)
        actions.keyDown(Keys.CONTROL)
               .sendKeys("a")
           //    .keyUp(Keys.CONTROL)
               .perform();

        Thread.sleep(2000);

        // CTRL + C (Copy)
        actions.keyDown(Keys.CONTROL)
               .sendKeys("c")
            //   .keyUp(Keys.CONTROL)
               .perform();

        Thread.sleep(2000);

        // Wait for password field
        WebElement password = driver.findElement(By.name("password"));
        password.click();

        // CTRL + V (Paste)
        actions.keyDown(Keys.CONTROL)
               .sendKeys("v")
            //   .keyUp(Keys.CONTROL)
               .perform();

        Thread.sleep(3000);

        driver.quit();
    }
}
