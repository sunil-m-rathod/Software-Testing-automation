package orangeTestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import orageHrBase.BaseClass;
import orageHrPages.HomePage;

public class HomePageTest extends BaseClass {

	 HomePage homepage;
	 @Test(priority = 3)
	public void adminTabTest()
	{
		homepage=loginpage.login();
		((HomePage) homepage).clickonadmintab();
		String expectedurl="https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers";
		 String actualurl= driver.getCurrentUrl();
		 
		 Assert.assertEquals(expectedurl, actualurl);
	}
}
