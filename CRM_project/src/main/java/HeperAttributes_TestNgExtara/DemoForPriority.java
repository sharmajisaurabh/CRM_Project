package HeperAttributes_TestNgExtara;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoForPriority {
	@Test(priority = 1)
	public void login() {
		System.out.println("login page is display");
	}
	@Test(priority = 2)
	public void search() {
		Assert.assertTrue(false);
		System.out.println("search the car");
	}
	@Test(priority = 3)
	public void AddtoCart() {
		System.out.println("add to cart car");
		Assert.assertTrue(true);
	}
	@Test(priority = 4)
	public void payment() {
		System.out.println("payment is successful !!!!");
	}

}
