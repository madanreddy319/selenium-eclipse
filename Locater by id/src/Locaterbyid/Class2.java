package Locaterbyid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class2 
{
	

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();// manages the windows and maximizes
		
		driver.get("https://www.facebook.com/");// open the website 
		
	WebElement element1 = driver.findElement(By.id("email"));
	
	
	element1.sendKeys("madanreddy319@gmail.com");
	
	Thread.sleep(2000);
	
	WebElement element2 = driver.findElement(By.id("pass"));
	
	
	element2.sendKeys("madan319");
	
	
	Thread.sleep(2000);
	
	
	WebElement element3 = driver.findElement(By.id("u_0_b"));
	
	element3.click();
	
		
		Thread.sleep(5000);// present the website for 5 seconds
		
		driver.quit();
		
		// TODO Auto-generated method stub

	}

}
