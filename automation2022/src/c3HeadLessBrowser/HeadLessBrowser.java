package c3HeadLessBrowser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessBrowser {

	
	
	public static void main(String[] args) {
		
		
		
//Headless browser		
		ChromeOptions option=new ChromeOptions();
		
		  option.setHeadless(true);
		
		
		

		System.setProperty("webdriver.chrome.driver", "S:\\0 Softer Tester\\data\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(option);        ///***
		driver.manage().window().maximize();
		driver.get("https://www.axisbank.com/retail/cards/credit-card");
		
		
		System.out.println( driver.getTitle());
		
		
		System.out.println(driver.getCurrentUrl());   
		
	}
	
	
	
	
}
