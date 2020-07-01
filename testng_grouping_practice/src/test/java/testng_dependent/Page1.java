package testng_dependent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Page1 
{
	public static void first_name (WebDriver driver) throws InterruptedException
	
	{
		
		
		WebElement element1 = driver.findElement(By.cssSelector("input[placeholder= 'Your Name']"));
	
	
	element1.sendKeys("madan");
	
	Thread.sleep(2000);
	
	}
	
	public static void middle_name (WebDriver driver) throws InterruptedException
	
	{
		
		WebElement element2 = driver.findElement(By.cssSelector("input[placeholder= 'Your Middle Name']"));
	
	
	element2.sendKeys("madan319");
	
	
	Thread.sleep(2000);
	
	}
public static void last_name(WebDriver driver) throws InterruptedException
	
	{
		
		
		WebElement element1 = driver.findElement(By.cssSelector("input[placeholder= 'Your Last Name']"));
	
	
	element1.sendKeys("madan");
	
	Thread.sleep(2000);
	
	}
public static void phone_number (WebDriver driver) throws InterruptedException

{
	
	
	WebElement element1 = driver.findElement(By.cssSelector("input[placeholder= 'Phone Number']"));


element1.sendKeys("madan");

Thread.sleep(2000);

}
public static void address (WebDriver driver) throws InterruptedException

{
	
	
	WebElement element1 = driver.findElement(By.cssSelector("input[placeholder= 'Your Address']"));


element1.sendKeys("madan");

Thread.sleep(2000);

}

	public static void switch_to_education (WebDriver driver) throws InterruptedException
	
	{
		
	
WebElement element = driver.findElement(By.linkText("Switch To (Education Form)"));
		
		Thread.sleep(2000);
		
		String winhandlebefore = driver.getWindowHandle();
		
		element.click();
		
		
		
		Thread.sleep(5000);// present the website for 5 seconds
		
	
	}
}
