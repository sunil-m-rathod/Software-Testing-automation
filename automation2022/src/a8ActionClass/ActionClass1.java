package a8ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass1 {

	public static void main(String[] args) throws InterruptedException {


		
		     String path= System.getProperty("user.dir");            //get property return project path. 
			
			String actual_path= path+"\\driver\\chromedriver.exe";  //take from driver properties 
			
			System.setProperty("webdriver.chrome.driver", actual_path );
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://demo.guru99.com/test/simple_context_menu.html");
			
			
	     WebElement rightclick = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
			
		   Actions AC=new Actions(driver);
		 
		    AC.contextClick(rightclick).build().perform();             //METHOD FOR RIGHT CLICK(contextClick)
		
		    //AC.moveToElement(rightclick).contextClick().build().perform();  //another method
		
		  driver.navigate().refresh();
		  
		  
		 WebElement doubleclick = driver.findElement(By.xpath("//button[contains(text(),'Double-Click Me To See Alert')]"));

		   AC.doubleClick(doubleclick).build().perform();        //for double click
		   
		        Thread.sleep(5000);
			driver.switchTo().alert().accept();
		 
		 
		 
		 
		 
	}

}
