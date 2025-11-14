package broken_links;

	import java.io.IOException;
	import java.net.HttpURLConnection;
	import java.net.URL;
	import java.net.URLConnection;
	import java.time.Duration;
	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;

	public class Links {
		@Test
		public void checkBrokenLinks() throws IOException {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

			driver.get("https://www.zomato.com/");

			List<WebElement> links = driver.findElements(By.tagName("a"));
			
			System.out.println(links.size());

//			

			for(WebElement link : links){
			    HttpURLConnection conn = (HttpURLConnection)new URL(link.getAttribute("href")).openConnection();
			    if(conn.getResponseCode() >= 400){
			        System.out.println("Broken: " + link.getAttribute("href"));
			    }
			}

			driver.quit();
		}
	}