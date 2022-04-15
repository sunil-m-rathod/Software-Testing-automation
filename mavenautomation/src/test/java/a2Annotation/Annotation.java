package a2Annotation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Annotation {

	  WebDriver driver;          //******
	
	@BeforeTest
	public void setup() throws InterruptedException
	{
		
		  String path= System.getProperty("user.dir");            
		  String actual_path= path+"\\driver\\chromedriver.exe";  
		  System.setProperty("webdriver.chrome.driver", actual_path );
		  
	      driver =new ChromeDriver();                                        //***
		  driver.manage().window().maximize();
		  driver.get("http://demo.automationtesting.in/Register.html");
		
		  Thread.sleep(5000);
		  
	}
	@Test
	public void sendkeys()
	{
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("sunil");
		driver.findElement(By.xpath("//input[@ng-model='LastName']")).sendKeys("Rathod");
	    driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("SOLAPUR");
	}
	@AfterTest(enabled = false)
	public void close()
	{
		driver.close();
		
	}
	
	
	
	
	
}
