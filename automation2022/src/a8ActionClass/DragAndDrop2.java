package a8ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop2 {

	public static void main(String[] args) throws InterruptedException {


		//drag and drop element 
		
		

		     String path= System.getProperty("user.dir");            //get property return project path. 
			 String actual_path= path+"\\driver\\chromedriver.exe";  //take from driver properties 
			
			System.setProperty("webdriver.chrome.driver", actual_path );
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
		
			driver.get("https://demo.guru99.com/test/drag_drop.html");
			Thread.sleep(5000);
			
			
			 WebElement element1 = driver.findElement(By.id("credit2"));
			 
			 WebElement element2 = driver.findElement(By.id("bank"));
			
			 Actions ac=new Actions(driver);
			 
			 ac.dragAndDrop(element1, element2).build().perform();            //drag and drop method ,need to locate two element 
		
			 Thread.sleep(50000);
			 
			 
			 WebElement element3 = driver.findElement(By.id("fourth"));
			 WebElement element4 = driver.findElement(By.id("amt8"));
			 
			  ac.dragAndDrop(element3, element4).build().perform();
			   
			 
			 
	}

}
