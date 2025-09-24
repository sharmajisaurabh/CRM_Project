package Listners;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Demo_Listner implements ITestListener {
	    
	    @Override
	    public void onTestStart(ITestResult result) {
	        System.out.println("Test Started: " + result.getName());
	    }

	    @Override
	    public void onTestSuccess(ITestResult result) {
	        System.out.println("✅ Test Passed: " + result.getName());
	    }

	    @Override
	    public void onTestFailure(ITestResult result) {
	        Reporter.log("❌ Test Failed: " + result.getName());
	    }

	    @Override
	    public void onTestSkipped(ITestResult result) {
	        System.out.println("⚠️ Test Skipped: " + result.getName());
	    }
	}
