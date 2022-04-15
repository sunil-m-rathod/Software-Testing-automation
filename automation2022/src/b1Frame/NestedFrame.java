package b1Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrame {

	public static void main(String[] args) throws InterruptedException {
		
		
		

		System.setProperty("webdriver.chrome.driver", "S:\\0 Softer Tester\\data\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/nestedframes");
		Thread.sleep(5000);
		
		
		driver.switchTo().frame("frame1");                         //parent frame
		
		System.out.println("text of parent :"+driver.getTitle());
		Thread.sleep(5000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']")));   //for child frame need to find xpath
		
		System.out.println("nested text :"+driver.findElement(By.xpath("//p[contains(text(),'Child Iframe')]")).getText());
		
		//driver.navigate().refresh();  //back to main page
        driver.switchTo().defaultContent();   //back to main page
		
		
	}

}
