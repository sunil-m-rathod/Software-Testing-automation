package a4DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelect2 {

	public static void main(String[] args) throws InterruptedException {


		
         String path= System.getProperty("user.dir");           //get property return project path. 
		
		String actual_path= path+"\\driver\\chromedriver.exe";           //take from driver properties 
		
		System.setProperty("webdriver.chrome.driver", actual_path );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://output.jsbin.com/osebed/2"); 
		
		//driver.findElement(By.xpath("//*[@id=\"fruits\"]/option[2]")).click();    //x path method also use to locate
		
		
		WebElement fruits = driver.findElement(By.id("fruits"));
		
	
		Select sel_fruits=new Select(fruits);            //create object of select method
		
		
		System.out.println("select multiple :" + sel_fruits.isMultiple());
		
		Thread.sleep(5000);
		
		sel_fruits.selectByIndex(1);
		
		Thread.sleep(5000);
		
		sel_fruits.selectByValue("orange");
		Thread.sleep(5000);
		
		sel_fruits.selectByVisibleText("Grape");
		Thread.sleep(5000);
		
		sel_fruits.deselectAll();     //deselect All value
		
		
		
		
		
		
	}

}
 