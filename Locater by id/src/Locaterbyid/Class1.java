package Locaterbyid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1 {

	public static void main(String[] args) throws InterruptedException
	{
		//System.setProperty("webdriver.gecko.driver", "/Users/madan\\ mohan\\ reddy/Desktop/geckodriver");
		WebDriver driver = new ChromeDriver();// creates an object for chrome driver
		
		driver.manage().window().maximize();// manages the windows and maximizes
		driver.get("https://www.facebook.com/");// open the website 
		Thread.sleep(5000);// present the website for 5 seconds
		driver.quit();// 
		
	}

}
