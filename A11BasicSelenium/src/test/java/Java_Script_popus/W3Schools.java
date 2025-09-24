package Java_Script_popus;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3Schools {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		//  prompt popup
		Alert ale = driver.switchTo().alert();
		ale.sendKeys("Sourabh");
		ale.accept();
		Thread.sleep(10000);
		driver.quit();
	}

} 