package Java_Script_popus;


import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebshop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.id("small-searchterms")).sendKeys("Saurabh sharma");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		Alert ale = driver.switchTo().alert();
      	ale.sendKeys("Saurabh sharma");
		
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		Thread.sleep(2000);
		ale.accept();
		driver.quit();

	}

}
