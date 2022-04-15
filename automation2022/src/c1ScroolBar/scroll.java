package c1ScroolBar;

import org.apache.batik.svggen.font.table.Script;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class scroll {

	public static void main(String[] args) throws InterruptedException {

		//to disable browser notification	
		ChromeOptions option=new ChromeOptions(); //**imp
		option.addArguments("--disable-notifications");
		
		


		System.setProperty("webdriver.chrome.driver", "S:\\0 Softer Tester\\data\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.axisbank.com/retail/cards/credit-card");
		
		Thread.sleep(10000);

//****		
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
	      
/*	//Scroll Up and Down
	   
		 js.executeAsyncScript("window.scrollBy(0,1000)");    //Horizontal, vertical
	    
		 Thread.sleep(5000);
	*/
		
		
	//Scroll down by visibility of element     
		 WebElement element = driver.findElement(By.xpath("/html/body/footer/div[1]/div/div[1]/div/ul/li[2]/ul/li[8]/a"));
		 
		 js.executeAsyncScript("arguments[0].scrollIntoView()",element);
		 
		 
		 
		
	}

}
