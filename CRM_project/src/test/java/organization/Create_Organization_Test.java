package organization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Create_Organization_Test {

	

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://localhost:8888/");
		WebElement username = driver.findElement(By.name("user_name"));
		WebElement password = driver.findElement(By.name("user_password"));
		username.sendKeys("admin");
		password.sendKeys("manager");
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.linkText("Organizations")).click();
		driver.findElement(By.cssSelector("img[title='Create Organization...']")).click();
		
		String orgname = "qspiders_" + (int)(Math.random()*9999);
		WebElement orgfield = driver.findElement(By.name("accountname"));
		orgfield.sendKeys(orgname);
		driver.findElement(By.cssSelector("input[style='width:74%;']")).sendKeys("Qspiders");
		driver.findElement(By.id("phone")).sendKeys("9625395442");
		driver.findElement(By.name("button")).click();
		
		WebElement EngineeringDD = driver.findElement(By.name("industry"));
		Select selectEngineering = new Select(EngineeringDD);
		selectEngineering.selectByIndex(11);

		//Verification process
		String actOrgName = driver.findElement(By.id("dtlview_Organization Name")).getText();
		if (actOrgName.equals(orgname)) {
			System.out.println("Organization created successfully!!!");
		}else {
			System.out.println("Organization could not be created successfully!!!");
		}
		
		//Logout 
		
		WebElement profile = driver.findElement(By.cssSelector("img[src='themes/softed/images/user.PNG']"));
		Actions act = new Actions(driver);
		act.moveToElement(profile).build().perform();
		driver.findElement(By.linkText("Sign Out")).click();
		Thread.sleep(3000);
		driver.quit();

	}

}
