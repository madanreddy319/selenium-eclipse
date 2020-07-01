package testng_dependent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Page1 
{
	public static void id (WebDriver driver) throws InterruptedException
	
	{
		
		
	WebElement element1 = driver.findElement(By.id("email"));
	
	
	element1.sendKeys("madanreddy319@gmail.com");
	
	Thread.sleep(2000);
	
	}
	
	public static void Pass (WebDriver driver) throws InterruptedException
	
	{
		
	WebElement element2 = driver.findElement(By.id("pass"));
	
	
	element2.sendKeys("madan319");
	
	
	Thread.sleep(2000);
	
	}
	
	public static void login (WebDriver driver) throws InterruptedException
	
	{
		
	
	
	WebElement element3 = driver.findElement(By.id("u_0_b"));
	
	element3.click();
	
		
		Thread.sleep(3000);// present the website for 5 seconds
		
	
	}
}
