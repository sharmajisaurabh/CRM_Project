package HeperAttributes_TestNgExtara;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoForIgnoringTestCase {
	@Test
	public void login() {
		System.out.println("Login page");
	}
	@Test(alwaysRun = true,enabled = false)
	
	public void search() {
		System.out.println("search the mobie");
	}
	@Test(enabled = false)
	
	public void AddtoCart() {
		Assert.assertTrue(true);
		
		System.out.println("add to cart mobile");
		Assert.assertTrue(true);
		
	}@Test
	public  void payment() {
		System.out.println("payment is successful !!!");
	}
}
