package a4DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelect1 {

	public static void main(String[] args) throws InterruptedException {
		
//for DropDown have 2 tag 1)Select tag 2)Option tag 
		
		String path= System.getProperty("user.dir");           //get property return project path. 
		
		String actual_path= path+"\\driver\\chromedriver.exe";           //take from driver properties 
		
		System.setProperty("webdriver.chrome.driver", actual_path );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		WebElement country = driver.findElement(By.name("country"));      //located element Stored in **Country

		//for DropDown  We are creating Object 

		Select sel_country=new Select(country);          //for drop down we have SELECT CLASS in selenium
		
		Thread.sleep(3000);
		 
	      sel_country.selectByIndex(10);             //select method by Index  :to select single value in drop down
		 
	  	  Thread.sleep(5000);
	      sel_country.selectByValue("BHUTAN");        //select By Value                
	     
	      Thread.sleep(5000);
	      sel_country.selectByVisibleText("CANADA");  //select by visible text
	      
	  	 System.out.println("select multi : " + sel_country.isMultiple());     //to check drop down selection is multiple or not 
	
	   
	}

}
