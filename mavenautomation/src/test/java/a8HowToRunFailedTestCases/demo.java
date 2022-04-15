package a8HowToRunFailedTestCases;

import org.junit.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class demo {

	@Test
	public void test1()
	{
		
		System.out.println("this id test case 1");
		
		Assert.assertTrue(false);
	}
	@Test
	public void test2()
	{
		
		System.out.println("this id test case 2");
		
		
		Assert.assertTrue(false);
		
	}
	
	
	
	
}
