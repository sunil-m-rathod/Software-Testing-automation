package b7Screenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	
	public static void main(String[] args) throws InterruptedException, IOException {
	
		System.setProperty("webdriver.chrome.driver", "S:\\0 Softer Tester\\data\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  
		driver.manage().window().maximize();        
	    driver.get("https://www.facebook.com"); 
		
	    Thread.sleep(3000);   
        
	    Date d=new Date();
	    SimpleDateFormat s=new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
	    
	    
	    File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(f, new File("C:\\Users\\sunil\\eclipse-workspace\\automation2022\\driver\\Test"+s.format(d)+".png")); 
	    
	    driver.close();
	    
	    
	}
	
	
}
