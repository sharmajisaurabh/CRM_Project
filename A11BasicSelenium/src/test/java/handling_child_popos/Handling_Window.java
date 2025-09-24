package handling_child_popos;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Window {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/");
		String pid = driver.getWindowHandle();
		
		System.out.print(pid);
		driver.findElement(By.linkText("Meta Pay")).click();
		
		Set<String> ids = driver.getWindowHandles();
		
      	System.out.println(ids);
		for (String i : ids) {
			driver.switchTo().window(i);
			if (driver.getTitle().contains("Pay")) {
				break;
			}
		}
		driver.close();
		Thread.sleep(3000);
		driver.quit();
		
		
		

	}

}
