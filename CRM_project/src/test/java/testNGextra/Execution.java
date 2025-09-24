package testNGextra;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Execution extends DemoFor_Configration_Annotation{
	@Test
	public void orgTest() {
		Reporter.log("Create organization",true);
	}

	@Test
	public void conTest() {
		Reporter.log("Create contact",true);
	}

}
