package a6Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {


		    String path= System.getProperty("user.dir");            //get property return project path. 
			
			String actual_path= path+"\\driver\\chromedriver.exe";  //take from driver properties 
			
			System.setProperty("webdriver.chrome.driver", actual_path );
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		
/*Alert Window with OK button (single click)	
		
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		
		
*/		
		
/*Alert window with OK And CANCEL button
		
			driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
			Thread.sleep(5000);
			//driver.switchTo().alert().accept();   	// for  OK button
		
			driver.switchTo().alert().dismiss();      //for cancel
			
*/			
			
//Alert window with input box,capture text from alert
			
			driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]")).click();
			Thread.sleep(5000);
			
			org.openqa.selenium.Alert alertwindow = driver.switchTo().alert();  //alert element
			
			System.out.println("the message display on alert window :"+alertwindow.getText());  //to display message on alert window
		
			alertwindow.sendKeys("hello sunil");
			alertwindow.accept();
			
		
		
	}

}
