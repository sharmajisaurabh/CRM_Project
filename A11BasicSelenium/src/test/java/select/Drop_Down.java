package select;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down {

	public static void main(String[] args) {
		WebDriver drive = new ChromeDriver();
		drive.get("https://www.facebook.com/r.php?entry_point=login");
		drive.manage().window().maximize();
		drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		drive.findElement(By.name("firstname")).sendKeys("saurabh");
		drive.findElement(By.name("lastname")).sendKeys("sharma");
		WebElement DayDD = drive.findElement(By.id("day"));
		Select selday = new Select(DayDD);
		selday.selectByIndex(4);
		
		WebElement monthDD = drive.findElement(By.id("month"));
		Select selmon = new Select(monthDD);
		selmon.selectByVisibleText("Jul");
		
		WebElement yearDD = drive.findElement(By.id("year"));
		ISelect selyear = new Select(yearDD);
		selyear.selectByValue("2001");
		
		drive.findElement(By.xpath("//label[text()='Male']")).click();
		drive.findElement(By.name("reg_email__")).sendKeys("7351076840");
		drive.findElement(By.name("reg_passwd__")).sendKeys("sharma@99");
		drive.quit();

	}

}
