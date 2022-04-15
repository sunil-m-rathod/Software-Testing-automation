package a1TestNGDemo;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;

public class Basic {

	
//In TestNG main method is not required.
//Run AS TestNG
//Test cases run as per chronological order(alphabetical order)	
/*different Annotation 
	
	@Test
	@BeforeSuit
	@AfterSuit
	@BeforeTest
	@AfterTest
	@BeforeClass
	@AfterClass
	@BeforeMethod
	@AfterMethod
	
	Hierarchy of Annotation
	@BeforeSuit
	@BeforeTest
	@BeforeClass
	@BeforeMethod
	@Test
	@AfterSuit
    @AfterTest
    @AfterClass
    @AfterMethod
    
 **ATTRIBUTES***   
     (dependsOnMethods="methodname") )
    (invocationCount = 2) :to run test case 2 time 
    (enabled= false)  : don not take test cases for execution. for skip test cases
    
    **WebdriverManger:download Dependency for maven**
    
	  WebDriverManager.chromedriver().setup();    //manage the chrome driver path
	  

assertEquals(actual, title);    //assert are used to compare actual result of application with expected result. 
Assert.assertTrue(false);	  
	  
	  
	*/
}
