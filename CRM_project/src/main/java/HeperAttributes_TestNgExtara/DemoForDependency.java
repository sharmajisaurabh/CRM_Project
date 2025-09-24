package HeperAttributes_TestNgExtara;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoForDependency {
	@Test
	public void login() {
		System.out.println("login the page");
		Assert.assertTrue(false);
	}
	@Test(dependsOnMethods = "login")
	public void search() {
		System.out.println("search the product");
	}
	@Test(dependsOnMethods = "search")
	public void AddtoCart() {
		System.out.println("added to cart product");
	}
	@Test(dependsOnMethods = "AddtoCart",alwaysRun = true)
	public void payment() {
		System.out.println("payment is seccessful");
	}
}
