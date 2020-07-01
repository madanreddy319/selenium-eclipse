package Main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Static.Democart;
import Static.Facebook;



public class Main {

	public static void main(String[] args)throws InterruptedException
	
	{
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();// manages the windows and maximizes

		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		Facebook.id(driver);
		
		Facebook.Pass(driver);
		 Thread.sleep(3000);
		Facebook.login(driver);
		
		  Thread.sleep(3000);
		  
		  
driver.get("https://demostore.x-cart.com/");
		
		Thread.sleep(2000);
		
		Democart.search1(driver);
		
		
		
		
		Democart.search2(driver);
		
		 
      
    
		Democart.search3(driver);
		
		
		  
		driver.quit();
		
		

	}

}
