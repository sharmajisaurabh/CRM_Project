package window_methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Window D =  driver.manage().window();
		D.maximize();
		D.minimize();
		D.fullscreen();
		driver.get("https://www.facebook.com/");
		D.maximize();
		Dimension D2 = driver.manage().window().getSize();
		System.out.println(D2);
		Dimension D3 = new Dimension(100, 100);
		driver.manage().window().setSize(D3);
		System.out.println(D3);
		Point p1 = driver.manage().window().getPosition();
		System.out.println(p1);
		Point p2 = new Point(888, 666);
		driver.manage().window().setPosition(p2);
		Thread.sleep(3000);
		driver.quit();
	}

}
