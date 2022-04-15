
package a5Wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {
//to solve Synchronization 	 issue we use Wait.
//we will add implicit wait only once. disadvantage is we add only 10 seconds .

	public static void main(String[] args) {
		
        String path= System.getProperty("user.dir");           //get property return project path. 
		
		String actual_path= path+"\\driver\\chromedriver.exe";           //take from driver properties 
		
		System.setProperty("webdriver.chrome.driver", actual_path );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
//Implicit wait
		
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		 WebElement facebookpage = driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]"));
		  facebookpage.sendKeys("facebook");
		  facebookpage.sendKeys(Keys.RETURN);     //**To return value when we click enter button.
		  
		  driver.findElement(By.xpath("//h3[contains(text(),'Facebook - Log In or Sign Up')]")).click();
		  
		  

	}

}
