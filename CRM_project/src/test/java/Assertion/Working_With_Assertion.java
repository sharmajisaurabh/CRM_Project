package Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Working_With_Assertion {
	@Test
	public void DemoHardAssert() {
		boolean status1 = true;
		boolean status2 = false;
		
		String a = "abc";
		String b = "pqr";
		String c = "xyz";
		String d = "pqr";
		
		int a1 = 11;
		int b1= 12;
		int c1 = 11;
		int d1 =  14;
		
		
		Object obj1 = null;
		Object obj2 = new Object();
		
		Assert.assertTrue(status1);
		Assert.assertFalse(status2);
		
		Assert.assertEquals(a, b);
		Assert.assertNotEquals(a, d);
		
		Assert.assertNull(obj1);
		Assert.assertNotNull(obj2);	
		
		SoftAssert sa = new SoftAssert();
		
		sa.assertTrue(status2);
		sa.assertFalse(status2);
		
		sa.assertNull(obj1);
		sa.assertNotNull(obj1);
		
		sa.assertEquals(c1, a1);
		sa.assertNotEquals(c1, d1);
		
		sa.assertAll();
	}
}
