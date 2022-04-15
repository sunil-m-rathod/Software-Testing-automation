package b5RobotClassFileUpload;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotClass {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "S:\\0 Softer Tester\\data\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
          
          driver.get("http://demo.automationtesting.in/Register.html");
	
          Thread.sleep(10000);
          WebElement locat = driver.findElement(By.id("imagesrc"));  //When click is not working,then use Action Class	
          
          Actions ac=new Actions(driver);
          ac.moveToElement(locat).click().build().perform();   //TO CLICK ACTION
          
          Thread.sleep(6000);
          
  //to upload file below procedure        
          StringSelection select=new StringSelection("S:\\0 Softer Tester\\data\\Image_created_with_a_mobile_phone.png.webp");
          
          Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select,null);     //to copy the path  (CTR+C)
          
  //TO UPLOAD FILE USING ROBOT CLASS      
          Robot r=new Robot();   //Keyboard and mouse action done using Robot class
          
          //r.keyPress(KeyEvent.VK_DOWN);
          
          r.setAutoDelay(4000);
          
 //Key pressed
          r.keyPress(KeyEvent.VK_CONTROL);   //(CTR)
          r.keyPress(KeyEvent.VK_V);         //(V)
          
          r.setAutoDelay(4000);
//Key release         
          
          r.keyRelease(KeyEvent.VK_V);
          r.keyRelease(KeyEvent.VK_CONTROL);
        
          r.setAutoDelay(4000);
          
         r.keyPress(KeyEvent.VK_TAB);     //TAB CLICK
         r.keyRelease(KeyEvent.VK_TAB);   //TAB release
         
         r.setAutoDelay(4000);
         
         r.keyPress(KeyEvent.VK_TAB);     //TAB CLICK
         r.keyRelease(KeyEvent.VK_TAB);   // //TAB release
          
         r.setAutoDelay(4000);
         r.keyPress(KeyEvent.VK_ENTER);
         r.keyRelease(KeyEvent.VK_ENTER);
         
         
         	
     
		
		
		
		
	}

}
