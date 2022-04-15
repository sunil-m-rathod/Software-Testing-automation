package a1BrowserNotoficatinPOPUP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserNotification {

	public static void main(String[] args) {
		
	//to disable browser notification	
		ChromeOptions option=new ChromeOptions(); //**imp
		option.addArguments("--disable-notifications");
		
		
		
		System.setProperty("webdriver.chrome.driver", "S:\\0 Softer Tester\\data\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(option);        ///***
		driver.manage().window().maximize();
		driver.get("https://www.axisbank.com/retail/cards/credit-card");
		
		
		
		
		
	}

}
