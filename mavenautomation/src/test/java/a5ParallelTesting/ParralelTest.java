package a5ParallelTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParralelTest {

	WebDriver driver;
	
	@Test
	public void test1()
	{
		
		 WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver(); 
		 
		    driver.manage().window().maximize();       
		    driver.get("https://www.facebook.com");
		    System.out.println("this is test 1: "+Thread.currentThread().getId());
		
	}
	
	@Test
	public void test2()
	{   
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver(); 
	    driver.get("https://opensource-demo.orangehrmlive.com");
		System.out.println("this is test 2: "+Thread.currentThread().getId());
		
	}
	
	
}
