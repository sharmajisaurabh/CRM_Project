package properties_extra;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Get_Data_From_Properties_File {

	public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream fis = new FileInputStream("C:\\Users\\ss582\\git\\CRM-project\\A11BasicSelenium\\src\\test\\resources\\Saurabh.Properties"); 
		Properties p = new Properties();
		p.load(fis);
		
		String BROWSER = p.getProperty("bro");
		String URL = p.getProperty("url");
		String USERNAME = p.getProperty("un");
		String PASSWORD = p.getProperty("pwd");
		System.out.println(BROWSER);
		System.out.println(URL);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		 WebDriver driver = null;
		 if(BROWSER.equals("firefox")) {
			  driver = new FirefoxDriver();
		 }
		 else if(BROWSER.equals("chrome")) {
			 driver = new ChromeDriver();}
		 
			 else if(BROWSER.equals("edge")) {
		 	driver=new EdgeDriver();}
		 	else {
		 		driver=new ChromeDriver();
		 	}
		 driver.get(URL);
		 driver.findElement(By.name("user_name")).sendKeys("admin");;
		 driver.findElement(By.name("user_password")).sendKeys("manager");;
		 
		 Thread.sleep(1000);
		 driver.quit();
		 
			 
		 
		
	}

}
