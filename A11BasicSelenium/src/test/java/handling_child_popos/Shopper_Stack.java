package handling_child_popos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shopper_Stack {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.shoppersstack.com/products_page/39");
	//     String sid = driver.getWindowHandle();
    //    System.out.print(sid);

		driver.findElement(By.id("compare")).click();
		driver.findElement(By.cssSelector("button[class=\"MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeSmall css-1j7qk7u\"]"));
		driver.quit();

	}
}
