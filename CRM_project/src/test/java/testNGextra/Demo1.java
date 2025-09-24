package testNGextra;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 {
	@Test
	public void case1()
	{
		System.out.println("This is First case");
		
	}
	@Test
	public void case2()
	{
		System.out.println("This is 2nd case");
		
	}
	@Test
	public void case3()
	{
		System.out.println("This is 3rd case");
		
	}
	public void case4() {
		Reporter.log("what is this",true);
	}

}
