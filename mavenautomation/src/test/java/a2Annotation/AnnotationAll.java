package a2Annotation;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationAll {

	
	@BeforeSuite
	public void BeforeSuit()
	{
		
		System.out.println("Before Suit  AnnotationAll");
	}
	
	@BeforeTest
	public void BeforeTest()
	{
		
		System.out.println(" Before Test AnnotationAll");
	}
	
	@org.testng.annotations.BeforeClass
	public void BeforeClass()
	{
		
		System.out.println("Before Class AnnotationAll");
	}
	
   @BeforeMethod
	public void BeforMethod()
	{
		
		System.out.println("Befor Method AnnotationAll");
	}
	
	@Test
	public void Test1()
	{
		
		System.out.println("Test 1 AnnotationAll");
	}
	@org.testng.annotations.AfterMethod
	public void AfterMethod()
	{
		
		System.out.println("After Method AnnotationAll");
	}
	
	@org.testng.annotations.AfterClass
	public void AfterClass()
	{
		
		System.out.println("After Class AnnotationAll");
	}
	
	@org.testng.annotations.AfterTest
	public void AfterTest()
	{
		
		System.out.println("After Test AnnotationAll");
	}
	
	@AfterSuite
	public void AfterSuit()
	{
		
		System.out.println(" After Suit AnnotationAll");
	}
	
	@Test
	public void Test2()
	{
	
		
		System.out.println("Test 2 AnnotationAll");
	}
	
}
