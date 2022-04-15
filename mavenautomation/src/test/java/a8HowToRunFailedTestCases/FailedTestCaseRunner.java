package a8HowToRunFailedTestCases;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.annotations.AfterTest;


public class FailedTestCaseRunner {

/*why test case fail	
	
	1)application failure :not getting excepted output 
	2)network issue
	3)server not respoding 
	4)scripting issue :locator change due new functionality
	5)browser issue 
	6)application is down
	
	how to execute failed test cases 
	1)by running "testing-failed.xml"
	2)By implementing TestNG IRetryAnalyzer interface

	
	*/
	
	@AfterTest
	public void failedtestcases()
	{
		
//imp to run failed test cases 
//add this method in testing.xml manually 		
		TestNG obj=new TestNG();
		
		List<String> list=new ArrayList<String>();
       		
		list.add("C:\\Users\\sunil\\eclipse-workspace\\mavenautomation\\test-output\\Suite\\testng-failed.xml");
		
		obj.setTestSuites(list);
		
		obj.run();
		 
		
		
	}
	
	
	
}
