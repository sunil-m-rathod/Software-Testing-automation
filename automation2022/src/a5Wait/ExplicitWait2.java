package a5Wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait2 {

	public static void main(String[] args) {
//it is element specific, every time need to add condition.
		
		
		  String path= System.getProperty("user.dir");           //get property return project path. 
			
			String actual_path= path+"\\driver\\chromedriver.exe";           //take from driver properties 
			
			System.setProperty("webdriver.chrome.driver", actual_path );
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.google.com");
			driver.manage().window().maximize();
		
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));	 
				
			 WebElement facebookpage = driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]"));
			  facebookpage.sendKeys("facebook");
			  facebookpage.sendKeys(Keys.RETURN);     //**To return value when we click enter button.
			
			  //for each element  need to add condition.
    	     WebElement element = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[contains(text(),'Facebook - Log In or Sign Up')]"))); //**add condition in Explicit wait//same condition need to write multiple element	  
    	          element .click();
			
	}

}
