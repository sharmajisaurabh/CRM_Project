package notification_popus;

		import java.rmi.Remote;
		import java.time.Duration;

		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.chrome.ChromeOptions;
		import org.openqa.selenium.edge.EdgeDriver;
		import org.openqa.selenium.firefox.FirefoxDriver;
		import org.openqa.selenium.remote.RemoteWebDriver;
		public class Notify_popus {

			public static void main(String[] args) throws InterruptedException {
				ChromeOptions setting = new ChromeOptions();
				setting.addArguments("--disable-notifications");
				setting.addArguments("--incognito");
				
				WebDriver driver = new ChromeDriver(setting);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
				driver.get("https://www.easemytrip.com/");
				
				Thread.sleep(10000);
				driver.quit();
				

	}

}
