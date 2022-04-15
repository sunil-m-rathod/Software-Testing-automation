package a2Locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDomExample4 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
	
		
System.setProperty("webdriver.chrome.driver", "S:\\0 Softer Tester\\data\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  
		driver.manage().window().maximize();
		driver.get("https://books-pwakit.appspot.com/");
		
		
		
	  //  driver.findElement(By.xpath("//input[@id='input']")).sendKeys("SUNIL");   //NoSuchElementException :not work on shadow DOM
	
//following is only method by which we locate shadow element
	   WebElement root  = driver.findElement(By.tagName("book-app"));   //shadow host(root element)
	
	    JavascriptExecutor js=( JavascriptExecutor)driver;     //**need to use java script executor class 
	    WebElement shadowdom1 = (WebElement)js.executeAsyncScript("return arguments[0].shadowRoot", root);
	    
	    WebElement appheader = shadowdom1.findElement(By.tagName("app-header"));
	    WebElement apptoolbar = appheader.findElement(By.cssSelector("app-toolbar.toolbar-bottom"));
	    WebElement bookinputdecoder = apptoolbar.findElement(By.tagName("book-input-decorator"));
	    
	    bookinputdecoder.findElement(By.cssSelector("input#input")).sendKeys("sofer testing book");
	
	
	}

}
