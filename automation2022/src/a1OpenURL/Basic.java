package a1OpenURL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Basic {

	public static void main(String[] args) {
		
/*	
 	Every Browser different Driver available 
		
		chrome browser........ChromeDriver.exe
		Firefox browser......Geckodriver.exe
		Edge Browser.........	edgedriver.exe
		
	download driver as your browser version:
	
	WebDriveris interface implemented by multiple Classes like 1)ChromeDriver 2)EdgeDriver  3)FirefoxDriver
	
		
	          System.setProperty("webdriver.chrome.driver", "S:\\0 Softer Tester\\data\\chromedriver_win32\\chromedriver.exe"); //providing path of chromedriver with extension
			
			   // create Reference of WEBDRIVER and Object of CHROMEDRIVER 
	
	*******	using WebDriverManager*********
	
	** WebDriverManager...download from maven repository 
	
	
	1)   WebDriverManager.chromdriver().setup();      //automatic setup the chrome driver path and no need to download manually driver  
	     WebDriverManager.edgedriver().setup();
		
	
	2)	     String path= System.getProperty("user.dir");           //get property return project path. 
			 String actual_path= path+"\\driver\\chromedriver.exe";           //take from driver properties 
			System.setProperty("webdriver.chrome.driver", actual_path );
			
			
			WebDriver driver=new ChromeDriver();	
		
		
	3)	  System.setProperty("webdriver.chrome.driver", "S:\\0 Softer Tester\\data\\chromedriver_win32\\chromedriver.exe");      //providing path of chromedriver with extension

		
		
		
//for Launching browser	
		
			       WebDriver driver=new ChromeDriver();       
		           WebDriver driver=new EdgeDriver();
		           WebDriver driver=new FirefoxDriver();
		
*/
	}

}
