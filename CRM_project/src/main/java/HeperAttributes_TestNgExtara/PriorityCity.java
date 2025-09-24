package HeperAttributes_TestNgExtara;

import org.testng.annotations.Test;

public class PriorityCity {
	@Test(priority = 1)
	public void createCity() {
		System.out.println("noida is created !");
	}
	@Test(priority = 2)
	public void modifyCity() {
		System.out.println("noida created !!");
		System.out.println("noida modify to okhla");
//		Assert.assertTrue(false);
	}
	@Test(priority = 3)
	public void DeleteCity() {
		System.out.println("okhla created");
		System.out.println("okhla deleted");
	}

}
