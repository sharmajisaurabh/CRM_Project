
package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Shopperstack {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.facebook.com/");

     	driver.findElement(By.name("login")).click();
//		
		driver.findElement(By.id("email")).sendKeys("ss5825109@gamil.com");
		driver.findElement(By.id("pass")).sendKeys("sharma@123");
      	WebElement Login = driver.findElement(By.id("loginbutton"));
//
		//Thread.sleep(5000); //Dumb wait
//
//		Explicit wait => Smart wait
	//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	//wait.until(ExpectedConditions.elementToBeClickable(check));
	
		//Login.click();

		Thread.sleep(6000);
		//driver.quit();
	}
}