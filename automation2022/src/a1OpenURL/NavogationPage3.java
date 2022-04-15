package a1OpenURL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavogationPage3 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "S:\\0 Softer Tester\\data\\chromedriver_win32\\chromedriver.exe"); //providing path of chromedriver with extension
		
		   // create Reference of WEBDRIVER and Object of CHROMEDRIVER 
		    
		     WebDriver driver=new ChromeDriver();        //for Launching browser
		    
		    driver.manage().window().maximize();        //for display window maximize this method use 
		   
		    driver.get("https://www.snapdeal.com");    //for opening url 	
		    
		    
		    
		    Thread.sleep(5000);
		    //driver.get("https://www.amazon.in"); 
		    
		 driver.navigate().to("https://www.amazon.in");
		 driver.navigate().back();             //back to snapdeal
		
		 Thread.sleep(5000);
		 
		 driver.navigate().forward();          //forward to amazon
		 
		 Thread.sleep(5000);
		 
		 driver.navigate().refresh();       //Refresh and reload page

		 driver.close();
		 
	}

}
