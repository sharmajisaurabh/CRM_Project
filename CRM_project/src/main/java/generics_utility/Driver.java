package generics_utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		WebDriver_Utility w1 = new WebDriver_Utility(driver);
		
		driver.get("https://www.facebook.com/");
		w1.fullscreen();
		w1.maximizewindow();
		//w1.hover(profile);
		driver.quit();

	}

}
