package a4DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BootstrapDropDown {

	public static void main(String[] args) throws InterruptedException {

//Look like dropDown but contain LINK
		
	 //**

        String path= System.getProperty("user.dir");           //get property return project path. 
		String actual_path= path+"\\driver\\chromedriver.exe";           //take from driver properties 
		
		ChromeOptions option=new ChromeOptions();         //**make changes in chrome setting to disable notification
		option.addArguments("--disable-notification");   
		
		
		System.setProperty("webdriver.chrome.driver", actual_path );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hdfcbank.com"); 
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Select Product Type')]")).click();
		
		 List<WebElement> producttype = driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']//li"));  //multiple product element stored in variable
		
		    System.out.println("number of product :" +producttype.size());
		    
		    for(  WebElement ptype :producttype)              //each value inside producttype come one by one in ptype
		    {
		    	
		    	if(ptype.getText().equals("Accounts"))
		    		
		    		ptype.click();
		    	    break;
		    }
		    
		    
		
		
	}

//ElementClickInterceptedException: when we open browser and notification comes in between 	
	
}
