package a1OpenURL;

	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

	public class OpenURL {
		
		public static void main(String[] args) {

			OpenURL a=new OpenURL();
			a.display();
			
	}
		public void display()
		{
			System.setProperty("webdriver.chrome.driver", "S:\\0 Softer Tester\\data\\chromedriver_win32\\chromedriver.exe"); //providing path of chromedriver with extension
		   
			//System.setProperty("webdriver.edge.driver", "S:\\0 Softer Tester\\data\\edge\\msedgedriver.exe");

			  // create instance of WEBDRIVER and Object of CHROMEDRIVER 
			    
			    //WebDriver driver=new EdgeDriver();        //for edge Launching browser
			
			    WebDriver driver=new ChromeDriver();        //for chrome Launching browser
			    
			    
			    
			    driver.manage().window().maximize();        //for display window maximize this method use 
			    driver.get("https://www.facebook.com");    //for opening url 
			    System.out.println("Title of page :" +driver.getTitle());         //title of current page
			    System.out.println("current url :" + driver.getCurrentUrl());     //current url
			    System.out.println("get page source :" +driver.getPageSource());  //page source 
			    
			   
			    
			    WebElement email = driver.findElement(By.id("email")); 	
			    
			    System.out.println("is Displayed :" +email.isDisplayed());    //is displayed method
			    System.out.println("is Enabled :" + email.isEnabled());       //is enabled metod
			   
			    
			    email.isSelected();     //is selected or not
			    email.clear();         //to clear selection
	
			    
			    
			    
			  
			    driver.close();                           //Close browser
			
		}
		
	}

//Element Not Intractable Exception (for link many tag input avaiable)
//No such Element Exception	
