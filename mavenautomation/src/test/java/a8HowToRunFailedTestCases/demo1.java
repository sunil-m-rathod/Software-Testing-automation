package a8HowToRunFailedTestCases;

import org.junit.Assert;
import org.testng.annotations.Test;

public class demo1 {

	
	
	
	@Test
	public void test3()
	{
		
		System.out.println("this id test case 3");
		
		Assert.assertTrue(false);
	}
	@Test
	public void test4()
	{
		
		System.out.println("this id test case 4");
		
		
		Assert.assertTrue(true);
		
	}
}
