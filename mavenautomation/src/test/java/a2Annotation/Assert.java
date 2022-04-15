package a2Annotation;

	import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class Assert {

		WebDriver driver;
		
		
		@BeforeTest
		public void initialize() {
			
		   WebDriverManager.chromedriver().setup();  //to setup chrome driver path
		   
		
		   driver=new ChromeDriver();
	    
	       driver.manage().window().maximize();        
	       driver.get("https://www.facebook.com");  
		
		}
		
		@Test
		public void verifyTitle()
		{
			String actual = driver.getTitle();
			String title="Facebook – log in or sign up";
					
			assertEquals(actual, title);
			
			//assertNotEquals(actual, title);
			
			
			//System.out.println(title.equals(actual));
			
		}
		
		@Test
		public void verifyTitle1()
		{
			String actual = driver.getTitle();
			String title="Facebook – log in or sign up";
					
			
			
			assertNotEquals(actual, title);
			
			
		   //System.out.println(title.equals(actual));
			
		}
		
		
		@AfterTest
		public void close()
		{
			
			driver.close();
		}
		
		
	}
	
	
	
	
