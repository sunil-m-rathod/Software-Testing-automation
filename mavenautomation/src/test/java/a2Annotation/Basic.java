package a2Annotation;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Basic {

	@BeforeTest
	public void nam()
	{
		System.out.println("sunil");
		
	}
	@Test
	public void middle()
	{
		
		System.out.println("megharaj");
	}
	@AfterTest
	public void last()
	{
		
		System.out.println("Rathod");
		
		
	}
	
	@Test(dependsOnMethods = "middle")            //when @Test is there for many method then method execute by chronological order.
	public void grand()
	{
		System.out.println("Umalu");
		
	}
	
	
	
	
}
