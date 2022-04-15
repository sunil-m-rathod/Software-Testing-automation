package orangeHrTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import orangeHr.page.LoginPage;

public class LoginTest {

	WebDriver driver;

	@BeforeTest
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com");
		
	}

	
	@Test
	public void verifyLogin() throws InterruptedException
	{
		
		LoginPage loginpage=new LoginPage(driver);
		
		loginpage.login("Admin","admin123");
		
		System.out.println(driver.getTitle());
		
		Thread.sleep(4000);
		
		String expcted = driver.getCurrentUrl();
		String actual="https://opensource-demo.orangehrmlive.com/index.php/dashboard";
		Assert.assertEquals(expcted, actual);
				
		System.out.println(driver.getTitle());
			
	}
	
	@AfterTest
	public void close()
	{
		driver.close();
		
	}
	
}
