package b4DateAndTimePicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException {


		
	
		String path= System.getProperty("user.dir");             //get property return project path. 
		
		String actual_path= path+"\\driver\\chromedriver.exe";    //take from driver properties 
		
		System.setProperty("webdriver.chrome.driver", actual_path );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/date-picker");
		
		   Thread.sleep(5000);
		   
		driver.findElement(By.id("datePickerMonthYearInput")).click();
		
		Select s= new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']")));
	   
		   //s.selectByIndex(6);
		   s.selectByValue("6");
		   Thread.sleep(5000);
		Select d=new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']")));
		
		 d.selectByValue("1995");
		 
		   Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--020']")).click();
		
		
		
		
	}

}
