package a4CrossBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.EdgeDriverManager;


public class CrossBrowser {
 
	WebDriver driver;
	
	@Parameters ("chrome") 

	
	@Test()
	public void launch( String browser)
	{
		if(browser.equalsIgnoreCase("chrome") )
		{
		
		System.setProperty("webdriver.chrome.driver", "S:\\0 Softer Tester\\data\\chromedriver_win32\\chromedriver.exe");
	    driver=new ChromeDriver(); 
	   
		
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			 WebDriverManager.edgedriver().setup();
			 driver=(WebDriver) new EdgeDriverManager();
		}
		
	        driver.manage().window().maximize();	
		    driver.get("https://opensource-demo.orangehrmlive.com");
			System.out.println("this is test : "+Thread.currentThread().getId());
			
//generate xml file and add classes tag and add name of class and method	
//add parameter tag
	}
	
	
}
 