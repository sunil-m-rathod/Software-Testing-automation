package b9CookiesHandling;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesHandling {

	public static void main(String[] args) {



		System.setProperty("webdriver.chrome.driver", "S:\\0 Softer Tester\\data\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
//Cookies handling method
		

	  
		
 Set<Cookie> cookies = driver.manage().getCookies();    //**1 capture all cookies
		
		  System.out.println("size of cookies :"+cookies.size());    
		
		  for(Cookie cookie:cookies)
		  {
			  System.out.println("name of cookie :"+ cookie.getName()+"  "+"value of cookie :"+cookie.getValue());
			  
		  }
		

System.out.println( driver.manage().getCookieNamed("sb")) ;                 //**2 by providing name of cookies  print name and values
		
   
//to add new cookie manually 

    Cookie co =new Cookie("sunilr1", "meghta45");
    driver.manage().addCookie(co);              //**
   
    cookies = driver.manage().getCookies();
    
    System.out.println("size of cookies :"+cookies.size());   

//delete specific cookies  

    driver.manage().deleteCookie(co);
   cookies = driver.manage().getCookies();
	System.out.println("size of cookies :"+cookies.size());   

//delete all cookies  
	
	driver.manage().deleteAllCookies();
	cookies = driver.manage().getCookies();
    System.out.println("size of cookies :"+cookies.size());   
  
        driver.close();
       
	}

}
