package Listners;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class Demo<WebDriver> {

	// Attach the Listener
	@Listeners(Listners.Demo_Listner.class)
	public class DemoTest {
		
		 @Test
		    public void teststart() {
		        System.out.println("Running test start...");
		        Assert.assertTrue(true);
		    }

	    @Test
	    public void testPass() {
	        System.out.println("Running testPass...");
	        Assert.assertTrue(true);
	    }

	    @Test
	    public void testFail() {
	        System.out.println("Running testFail...");
	        Assert.fail("Forcing failure");
	    }

	    @Test
	    public void testSkip() {
	        System.out.println("Running testSkip...");
	        throw new SkipException("Skipping this test");
	    }
	}
	
//	@Test(retryAnalyzer = Listner.List_Imp_Retry.class)
//	public void amazon() {
//		WebDriver driver = new ChromeDriver();
//		driver.get("https:www.amazon.com");
//		WebElement Verify = driver.findElement(By.cssSelector("a[arja-label='amazon.in]"));
//		Assert.assrtTrue(Verify.isDisplayed());
//	}
}
