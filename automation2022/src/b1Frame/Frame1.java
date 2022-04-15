package b1Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame1 {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "S:\\0 Softer Tester\\data\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		Thread.sleep(5000);
//in frame we can not interact directly with element 	
		
	//1st frame	 
		driver.switchTo().frame("packageListFrame");          //name of frame in which element present 
		
		driver.findElement(By.xpath("//body/main[1]/ul[1]/li[1]/a[1]")).click();
		
		driver.switchTo().defaultContent();             //go back to main page
		Thread.sleep(5000);
//2nd frame
		
		driver.switchTo().frame("packageFrame"); 
		
		driver.findElement(By.xpath("//body/main[1]/div[1]/section[1]/ul[1]/li[14]/a[1]/span[1]")).click();
		driver.switchTo().defaultContent();             //go back to main page
		
		Thread.sleep(5000);
//3rd frame		
		
		driver.switchTo().frame("classFrame"); 
		
		driver.findElement(By.xpath("//header/nav[1]/div[1]/div[1]/ul[1]/li[8]/a[1]")).click();
		
		
		
		
	}

}
