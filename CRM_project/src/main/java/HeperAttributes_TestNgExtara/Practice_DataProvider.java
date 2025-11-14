package HeperAttributes_TestNgExtara;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Practice_DataProvider {
	@Test (dataProvider = "getData")
	public void method1(String un, String pwd) throws InterruptedException {

		System.out.println(un);
		System.out.println(pwd);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.saucedemo.com/v1/");
		driver.findElement(By.id("user-name")).sendKeys(un);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(1000);
		driver.quit();
	}
	@DataProvider
	public Object[][] getData() throws InterruptedException{
		Object[][] credentails = new Object[2][2];
		
		credentails [0][0] = "saurabh";
		credentails [0][1] = "saurabh@1234";
		
		credentails [1][0] = "umesh";
		credentails [1][1] = "umesh@1234";
		
		credentails [2][0] = "lavi";
		credentails [2][1] = "lavi@1234";
		
		credentails [3][0] = "kallu";
		credentails [3][1] = "kallu@1234";
		
	//	credentails [4][0] = "Aallu";
	//	credentails [4][1] = "Aallu@1234";	
		return credentails;
	}

}
