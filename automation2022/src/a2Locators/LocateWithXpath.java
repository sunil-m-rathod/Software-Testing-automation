package a2Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateWithXpath {

	public static void main(String[] args) {
		
/*   X path 
		 
 Actual X path
				   /html/body/div/div[2]...................actual x path (if there are some changes in design and Dev remove some DIV,if single DIV remove or added that is problematic situation to find that particular element.  
				
		
Relative X path
				 
			     
				   //*[@id='email' or  @type='text'] ........In all tab
				
 Relative Method in XPath
		  
	and & or 	
//input[@id='email' and @type='text']...and ...In INPUT TAG if both condition true
//input[@id='email' or  @type='text']... Or.....In INPUT TAG if any one condition true
	 
	Contain and starts-with
//*[contains(text(),'Groups')             to locate LINK  check for text contain in a input tag (inside String)
//*[starts-with(text(),'Groups')]         (String starts-with Groups)

**self**

//a[contains(text(),'Groups')]/self::a
 

**parent**		

//a[contains(text(),'Groups')]//parent::li
//a[starts-with(text(),'Groups')]//parent::li 
 
**following sibling and preceding sibling**

 //a[starts-with(text(),'Groups')]//parent::li//following-sibling::li[4]    ..following sibling after current 
 //a[contain(text(),'Groups')]//parent::li//following-sibling::li[4] 
  
//a[starts-with(text(),'Groups')]//parent::li//preceding-sibling::li[4]   ..Preceding sibling before current 
//a[contain(text(),'Groups')]//parent::li//preceding-sibling::li[4]

 
 //a[starts-with(text(),'Groups')]//parent::li//parent::ul//parent::div//parent::div//parent::div//parent::div//parent::div//parent::div//parent::body//parent::html     //for locate parent of control element
	  

   
			
			
			*/

		
		
 //these 4Step required every time
 //selectorhub   extension used in chrome to find Xpath
		
		System.setProperty("webdriver.chrome.driver", "S:\\0 Softer Tester\\data\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sunilrathod2222@gmail.com");      //by xpath 

	}

} 
