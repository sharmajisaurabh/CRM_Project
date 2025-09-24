package testNGextra;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;


public class DemoFor_Configration_Annotation {

	@BeforeSuite
	public void dbConn() {
		System.out.println("Database connectivity + Report configuration");
	}

	@BeforeTest
	public void preCon() {
		System.out.println("Pre conditions");
	}

	@BeforeClass
	public void openBro() {
		System.out.println("browser open");
	}

	@BeforeMethod
	public void login() {
		System.out.println("login");
	}

	@AfterMethod
	public void logOut() {
		System.out.println("logout");
	}

	@AfterClass
	public void closeBro() {
		Reporter.log("browser close",true);
	}

	@AfterTest
	public void postCon() {
		Reporter.log("post condition",true);
	}

	@AfterSuite
	public void dbClose() {
		Reporter.log("Database connectivity close + Report Backup",true);
	}
}


