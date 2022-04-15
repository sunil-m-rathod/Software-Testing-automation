package a2Annotation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Class1 {

	WebDriver driver;
	
	@BeforeTest
	public void initialise() {
		
	   WebDriverManager.chromedriver().setup();  //to setup chrome driver path.
	   
	
	   driver=new ChromeDriver();
    
       driver.manage().window().maximize();        
       driver.get("https://www.facebook.com");  
	
	}
	
	@Test
	public void verifyTitle()
	{
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
			
	}
	
	@AfterTest
	public void close()
	{
		
		driver.close();
	}
	
	
}
