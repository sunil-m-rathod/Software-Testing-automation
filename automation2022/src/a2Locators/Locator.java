package a2Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "S:\\0 Softer Tester\\data\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//FindElement Throw Exception, when element not locate
		//use to locate element uniquely 
		WebElement email = driver.findElement(By.id("email"));            //to find element and Locate using "id" Attributes and "email" value
		email.sendKeys("sunilrathod2222@gmail.com");                    //pass value in element using SENDKIYS
		
		driver.findElement(By.id("pass")).sendKeys("Sunil@1995");   //if not using pass  again no need to create variable like line no 18
		
		//driver.findElement(By.name("login")).click();              //click used for Button
          
		//driver.findElement(By.tagName("a")).click();                //by Tag name (for link)Don't Use
	
		//to locate LInk is Difficult
		
		driver.findElement(By.linkText("Forgotten password?")).click();   //for LINK,LinkTxt   (for Link Input Tag is a)
	
		driver.findElement(By.partialLinkText("Voting ")).click();       //Partial Link Text Given
	
		
	
	

	}

} 
