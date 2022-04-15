package a2Annotation;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationAll2 extends AnnotationAll {

	
//call parent fist when inhitance 	
	
	@BeforeSuite
	public void BeforeSuitAnnotationAll2()
	{
		
		System.out.println("Before Suit AnnotationAll2");
	}
	
	@BeforeTest
	public void BeforeTestAnnotationAll2()
	{
		
		System.out.println(" Before Test AnnotationAll2");
	}
	
	@org.testng.annotations.BeforeClass
	public void BeforeClassAnnotationAll2()
	{
		
		System.out.println("Before Class AnnotationAll2");
	}
	
   @BeforeMethod
	public void BeforMethodAnnotationAll2()
	{
		
		System.out.println("Befor Method AnnotationAll2");
	}
	
	@Test
	public void Test1AnnotationAll2()
	{
		
		System.out.println("Test 1 AnnotationAll2");
	}
	@org.testng.annotations.AfterMethod
	public void AfterMethodAnnotationAll2()
	{
		
		System.out.println("After Method AnnotationAll2");
	}
	
	@org.testng.annotations.AfterClass
	public void AfterClassAnnotationAll2()
	{
		
		System.out.println("After Class AnnotationAll2");
	}
	
	@org.testng.annotations.AfterTest
	public void AfterTestAnnotationAll2()
	{
		
		System.out.println("After Test AnnotationAll2");
	}
	
	@AfterSuite
	public void AfterSuitAnnotationAll2()
	{
		
		System.out.println(" After Suit AnnotationAll2");
	}
	
	
	
}
