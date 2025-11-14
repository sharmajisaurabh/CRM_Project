package Listners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class List_Imp_Retry implements IRetryAnalyzer {
	int count = 0;
	int initialCount = 4;
	
	@Override
	public boolean retry(ITestResult result) {
	if(count<=initialCount) {
		count++;
		return true;
	}
	else {
		return false;	
		}
	}
		
}
