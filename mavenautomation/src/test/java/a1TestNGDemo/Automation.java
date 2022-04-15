package a1TestNGDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automation {
	
	 WebDriver driver; 
	@Test(invocationCount = 1)
	public void facebookpage()
	{

	
		    WebDriverManager.chromedriver().setup();
		
		    //System.setProperty("webdriver.chrome.driver", "S:\\0 Softer Tester\\data\\chromedriver_win32\\chromedriver.exe"); //providing path of chromedriver with extension
		
		    
		    driver=new ChromeDriver();        
		    
		    driver.manage().window().maximize();        
		    driver.get("https://www.facebook.com");    
		
	}
	
	@Test(dependsOnMethods = "facebookpage")
	public void Quite()
	{
	    driver.close();
		System.out.println("quite method");
		
	}
	
	@Test(enabled= true) 
	public void click()
	{
		
		System.out.println("this method not work");
	}
	
}
