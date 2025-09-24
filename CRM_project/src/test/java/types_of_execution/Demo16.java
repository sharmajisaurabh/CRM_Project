package types_of_execution;

import org.testng.annotations.Test;

public class Demo16 {
	
	
		@Test(groups = "smoke")
		public void case5() {
			System.out.println("method 5 smoke");
		}
		
		@Test(groups = "regrassion")
		public void case6() {
			System.out.println("case6 method regrassion");
		}
		
		@Test(groups = "")
		public void case7() {
			System.out.println("null value"); 
		}
		
		@Test(groups = "regrassion")
		public void case8() {
			System.out.println("methods 8 ends regrassion");
		}

	}
