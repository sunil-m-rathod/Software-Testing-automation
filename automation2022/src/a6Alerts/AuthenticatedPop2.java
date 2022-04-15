package a6Alerts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticatedPop2 {

	public static void main(String[] args) {


		String path= System.getProperty("user.dir");            //get property return project path. 
		
		String actual_path= path+"\\driver\\chromedriver.exe";  //take from driver properties 
		
		System.setProperty("webdriver.chrome.driver", actual_path );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//driver.get("http://the-internet.herokuapp.com/basic_auth");    //pop url
	
		 driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		
/*	syntax for Authenticated Pop
	http://ADMIN:ADMIN@the-internet.herokuapp.com/basic_auth	
	http://username:password@URL
*/		
		
		
		
		
		
		
		
		
	}

}
