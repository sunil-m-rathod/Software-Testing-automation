package a6Alerts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PermissionPopNotification3 {

	public static void main(String[] args) {
		
		ChromeOptions option=new ChromeOptions();         //**make changes in chrome setting to disable notification
		option.addArguments("--disable-notification");    //**
		
		
         String path= System.getProperty("user.dir");            //get property return project path. 
		
		String actual_path= path+"\\driver\\chromedriver.exe";  //take from driver properties 
		
		System.setProperty("webdriver.chrome.driver", actual_path );
		
		
		WebDriver driver=new ChromeDriver(option);    //**
		
		 driver.manage().window().maximize();    
		 driver.get("https://www.makemytrip.com");
		
		
		
		

	}

}
