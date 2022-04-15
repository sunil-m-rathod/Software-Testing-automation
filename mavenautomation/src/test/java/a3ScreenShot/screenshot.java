package a3ScreenShot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;      //import

public class screenshot {

	

public class Automation {
	
	 WebDriver driver; 
	@BeforeTest
	public void facebookpage() throws IOException
	{

		   
		    System.setProperty("webdriver.chrome.driver", "S:\\0 Softer Tester\\data\\chromedriver_win32\\chromedriver.exe"); //providing path of chromedriver with extension
		
		     WebDriverManager.chromedriver().setup();   //to setup chrome driver path
		   
		    driver=new ChromeDriver();        
		    
		    driver.manage().window().maximize();        
		    driver.get("https://www.facebook.com");    
	}
	           @Test (invocationCount = 3)
		    public void screenshot() throws IOException, InterruptedException
		    {
		    	
	        Thread.sleep(3000);   
	        
		    Date d=new Date();
		    SimpleDateFormat s=new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
		    
		    
		    File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    FileUtils.copyFile(f, new File("C:\\Users\\sunil\\eclipse-workspace\\mavenautomation\\screenshot\\Test"+s.format(d)+".png")); 
				    
		    }
		   
		     
		    
	
	
	@AfterTest
	public void Quite()
	{
	    driver.close();
		System.out.println("quite method");
		
	}
	
	

	
}
	
}
