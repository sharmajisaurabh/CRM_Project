package types_of_execution;

import org.testng.annotations.Test;

public class Demo15 {
	
	
		@Test(groups = "regrassion")
		public void case1() {
			System.out.println("case1 method regrassion ");
		}
		
		@Test(groups = "regrassion")
		public void case2() {
			System.out.println("case2 method regrassion");
		}
		
		@Test(groups = "smoke")
		public void case3() {
			System.out.println(" method 3  smoke"); 
		}
		
		@Test(groups = "regrassion")
		public void case4() {
			System.out.println("methods 4 ends regrassion");
		}

	}
