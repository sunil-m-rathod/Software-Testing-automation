package a3RadioButton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "S:\\0 Softer Tester\\data\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/radio.html");
		
		WebElement radio = driver.findElement(By.id("vfb-7-1"));      //to use value we create Variable radio
	
		System.out.println("value of text of element : "+radio.getAttribute("value"));
		
		//driver.wait(3000);                //wait for 3 second //exception should come but throws method not handle exception
		Thread.sleep(3000);                 //wait for 3 second and after perform next operation
		radio.click();
		
		WebElement radio1 = driver.findElement(By.id("vfb-7-2"));      //to use value we create Variable radio
		
		System.out.println("value of text of element : "+radio1.getAttribute("value"));
		
		//driver.wait(3000);                //wait for 3 second //exception should come but throws method not handle exception
		Thread.sleep(3000);                 //wait for 3 second and after perform next operation
		radio1.click();
		 
		
	WebElement radio2 = driver.findElement(By.id("vfb-7-3"));      //to use value we create Variable radio
		
		System.out.println("value of text of element : "+radio2.getAttribute("value"));
		
		//driver.wait(3000);                //wait for 3 second //exception should come but throws method not handle exception
		Thread.sleep(3000);                 //wait for 3 second and after perform next operation
	
		radio2.click();
		
/*******************************************************************************************************************/
	
	}

}
