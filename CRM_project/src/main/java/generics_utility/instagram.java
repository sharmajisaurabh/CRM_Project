package generics_utility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class instagram {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		WebDriver_Utility wdu=new WebDriver_Utility(driver);
		driver.get("https://www.facebook.com/"); 
		
		wdu.maximizewindow();
		wdu.fullscreen();
		
		wdu.ssw();
	//	wdu.sse();
		Thread.sleep(2000);
		driver.quit();
		}

}
