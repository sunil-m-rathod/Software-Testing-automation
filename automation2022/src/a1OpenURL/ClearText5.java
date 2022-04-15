package a1OpenURL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearText5 {

	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "S:\\0 Softer Tester\\data\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
		
		WebElement emailinputbox = driver.findElement(By.xpath("//input[@id='Email']"));
		
		 emailinputbox.clear();         //to clear value 
		 emailinputbox.sendKeys("sunilrathod2222@gmail.com");

//capturing text from input box
		 
		System.out.println( "Result from getAttribute :"+ emailinputbox.getAttribute("value"));  //return value of any attributes
		System.out.println( "Result from text :"+ emailinputbox.getText());         //return value of inner text
	}

}
