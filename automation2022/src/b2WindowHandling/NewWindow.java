package b2WindowHandling;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewWindow {

	public static void main(String[] args) throws InterruptedException {


		
		System.setProperty("webdriver.chrome.driver", "S:\\0 Softer Tester\\data\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		Thread.sleep(5000);
		
		
/*	driver.getWindowHandle()  //for single window handle
    driver.getWindowHandles() //for all window handle
			
*/	
		
		String str=driver.getWindowHandle();         //get parent windows handler
		System.out.println(str);                     //to print windows handle 
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);  
		
		driver.findElement(By.id("windowButton")).click();
	
		Set<String> all_tab = driver.getWindowHandles();    //get parent and child windows handler
		
		for(String a:all_tab) 
		{
			
			System.out.println(a);
			
			if(!a.equals(str)) 
			{
				
				driver.switchTo().window(a);
			}
		}
		
/*  //when implicitlyWait	not work the use below 
 	
		WebDriverWait wt =new WebDriverWait(driver,10);
		
	    wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("sampleHeading"))));
*/		
		
		
  Thread.sleep(5000);
  
         System.out.println( "text of new tab :" +driver.findElement(By.id("sampleHeading")).getText());
         Thread.sleep(5000);
        // driver.close();            //close only current browser
         
         driver.switchTo().window(str);   //back to parent  window
         
         Thread.sleep(5000);
         driver.quit();             //close all tab
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
