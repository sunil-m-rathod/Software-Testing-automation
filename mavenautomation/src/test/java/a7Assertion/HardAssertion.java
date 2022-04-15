package a7Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HardAssertion {

	WebDriver driver;
	
	@BeforeTest
	public void  setup()
	{
		
		 WebDriverManager.chromedriver().setup();
		
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	
	}
	@Test
	public void Test1()
	{
		WebElement image = driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
		
		System.out.println("image dispalyed :"+image.isDisplayed());
		
		
		
	}
	@Test
	public void Test2()
	{
		
		WebElement link = driver.findElement(By.xpath("//*[@id=\"forgotPasswordLink\"]/a"));
		
		System.out.println("link diplayed :"+link.isDisplayed());
		
	}
	@Test
	public void Test3()
	{
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	    driver.findElement(By.name("Submit")).click();	
		
		Assert.assertTrue(true);     //we pass or fail the test case manually
		
	}
	@AfterTest
	public void Test4()
	{
		
		
		driver.close();
		
		
	}
}
