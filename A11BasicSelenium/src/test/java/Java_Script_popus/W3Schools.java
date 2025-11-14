package Java_Script_popus;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3Schools {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");

        // Switch to iframe using WebElement
        WebElement iframe = driver.findElement(By.id("iframeResult"));
        driver.switchTo().frame(iframe);

        // Click on Try It button
        driver.findElement(By.xpath("//button[text()='Try it']")).click();

        // Handle prompt popup
        Alert ale = driver.switchTo().alert();
        ale.sendKeys("Sourabh");
        ale.accept();

        // Get the result text after handling prompt
        String resultText = driver.findElement(By.id("demo")).getText();
        System.out.println("Result: " + resultText);

        Thread.sleep(5000);
        driver.quit();
    }
}
