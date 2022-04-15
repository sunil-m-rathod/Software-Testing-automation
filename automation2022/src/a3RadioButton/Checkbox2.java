package a3RadioButton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox2 {

	public static void main(String[] args) throws InterruptedException {    //throw exception forTread.sleep

		System.setProperty("webdriver.chrome.driver", "S:\\0 Softer Tester\\data\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/radio.html");
		

                          /* Check box */
		
        WebElement check3 = driver.findElement(By.id("vfb-6-0"));      //to use value we create Variable check

          System.out.println("value of text of element : "+check3.getAttribute("value"));

           //driver.wait(3000);                //wait for 3 second //exception should come but throws method not handle exception
           Thread.sleep(3000);                 //wait for 3 second and after perform next operation
            check3.click();

          WebElement check4 = driver.findElement(By.id("vfb-6-1"));      //to use value we create Variable check

          System.out.println("value of text of element : "+check4.getAttribute("value"));

            //driver.wait(3000);                //wait for 3 second //exception should come but throws method not handle exception
            Thread.sleep(3000);                 //wait for 3 second and after perform next operation
            check4.click();

              WebElement check5 = driver.findElement(By.id("vfb-6-2"));      //to use value we create Variable check

             System.out.println("value of text of element : "+check5.getAttribute("value"));

             //driver.wait(3000);                //wait for 3 second //exception should come but throws method not handle exception
            Thread.sleep(3000);                 //wait for 3 second and after perform next operation
            check5.click(); 


	}

}
