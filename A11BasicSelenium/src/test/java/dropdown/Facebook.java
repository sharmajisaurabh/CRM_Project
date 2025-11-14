package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		
		driver.findElement(By.name("firstname")).sendKeys("Saurabh");
		driver.findElement(By.name("lastname")).sendKeys("Sharma");
      	WebElement Login = driver.findElement(By.id("loginbutton"));
		
		WebElement dayDD = driver.findElement(By.id("day"));
		Select selDay = new Select(dayDD);
		selDay.selectByIndex(4);
		
		WebElement monthDD = driver.findElement(By.id("month"));
		Select selMon = new Select(monthDD);
		selMon.selectByIndex(6);
		
		WebElement monthDD1 = driver.findElement(By.id("month"));
		Select s = new Select(monthDD);
		for (int i=0;i<s.getOptions().size();i++)
			s.selectByIndex(i);
		
		WebElement yearDD = driver.findElement(By.id("year"));
		Select selyea = new Select(yearDD);
		selyea.selectByIndex(24);
	
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		
		List<WebElement> years =  selyea.getOptions();
		for (WebElement i : years) {
			String vt = i.getText();
		
			System.out.println(vt);
		}
			Thread.sleep(100);
			
		
			driver.findElement(By.name("reg_email__")).sendKeys("saurabhnbd8@gmail.com");
			Thread.sleep(200);
			
			driver.findElement(By.name("reg_passwd__")).sendKeys("Sharma@123");
			
			driver.findElement(By.xpath("(//button[1])")).click();
			System.out.println("xpath");
			
			Thread.sleep(3000);
		//	driver.quit();
	}
}