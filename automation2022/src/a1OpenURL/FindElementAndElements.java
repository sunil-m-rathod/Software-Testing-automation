package a1OpenURL;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementAndElements {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "S:\\0 Softer Tester\\data\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//FindElement Throw Exception, when element not locate
		//use to locate element uniquely 
		
		WebElement email = driver.findElement(By.id("email"));    //to find element and Locate using "id" Attributes and "email" value
		email.sendKeys("sunilrathod2222@gmail.com"); 
		
		
//By using FindElemets capture multiple elements 	(used in multiple links) 
		 
// FindElements not Throw Exception, when element not locate
 //use when when number of element available (use for link)
				
			List<WebElement> x = driver.findElements(By.tagName("a"));   // a=denote link  Tag 
				
//how many links in (a),we find with following method
				System.out.println("No of Links "+ x.size());    //how much value stored in X provides(X.size)
				
 //to find Text and Link
		for(WebElement i:x) {
		System.out.println(i.getText()+"  : "+i.getAttribute("href"));  //get text(other than English it print ? mark) and provide attributes and we get value for that 
		
		
		}	
	}

}
