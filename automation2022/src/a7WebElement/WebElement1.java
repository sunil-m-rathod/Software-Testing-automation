package a7WebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement1 {

	public static void main(String[] args) throws InterruptedException {


		
		String path= System.getProperty("user.dir");            //get property return project path. 
		
		String actual_path= path+"\\driver\\chromedriver.exe";  //take from driver properties 
		
		System.setProperty("webdriver.chrome.driver", actual_path );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://worldathletics.org/competitions/olympic-games/the-xxxi-olympic-games-7093747/medaltable");
		
		Thread.sleep(5000);
		
		WebElement country = driver.findElement(By.xpath("//table[@class='src-components-Tables-Table-__Table__table--2HmHX LocMedalTable_table__1n6dN src-components-Tables-Table-__Table__standard--NLQqk']//tbody//tr//td[2]"));
		
		//System.out.println("country text :"+country.getText());
		//country.click();
		
	
		
		 List<WebElement> country1 = driver.findElements(By.xpath("//table[@class='src-components-Tables-Table-__Table__table--2HmHX LocMedalTable_table__1n6dN src-components-Tables-Table-__Table__standard--NLQqk']//tbody//tr//td[2]"));
		
		
		
		    for( WebElement x:country1)
		    {
		    	
		    	System.out.println(" Country name :	" +x.getText());
	
		   
		    }
		
		
		
		
	}

}
