package a7Assertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert1 {

	
	
	SoftAssert a=new SoftAssert();
	@Test
	public void test1()
	{
		
		System.out.println("11111111111111111");
		System.out.println("2222222222222222222");
		 a.assertTrue(false);                         //fail still run all test
		System.out.println("333333333333333333333333");
		System.out.println("444444444444444");
		a.assertAll();
		
	}
	
}
