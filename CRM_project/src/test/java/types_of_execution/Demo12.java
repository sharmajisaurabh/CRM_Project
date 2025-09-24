package types_of_execution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo12 {
	@Test
	public void case3() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.quit();
		Thread.sleep(200);
		System.out.println("case2 method execute");
	}
}

