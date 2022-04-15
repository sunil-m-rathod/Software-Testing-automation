package a4CrossBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.EdgeDriverManager;

public class BySwitchCase {

	WebDriver driver;
	
	@BeforeTest
	@Parameters ("browser") 
	public void Launch (String browser)
	{
		
		switch(browser)
		{
		
		case "chrome":
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		break;
		
/*		case "edge":
		System.setProperty("webdriver.chrome.driver", "S:\\0 Softer Tester\\data\\edge\\msedgedriver.exe");
		driver=new EdgeDriver();    //*****not working in my divice
		break;	
		
		default:
		  driver=null;
		  break;
*/			
		}
		
	}
	
	    @Test
		public void Verify()
		{
		
		    driver.get("https://www.facebook.com");  
			
		    System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
		}
	   
		
		@AfterTest
		public void close()
		{
			
			driver.close();
		}
		
	
	
}
