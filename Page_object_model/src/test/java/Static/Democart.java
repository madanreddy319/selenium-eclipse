package Static;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Democart {

	public static void search1(WebDriver driver) throws InterruptedException 
	
	
	{
		
WebElement element4 = driver.findElement(By.name("substring"));
		
element4.sendKeys("iphone");

Thread.sleep(2000);

element4.clear();

}
	

	
	public static void search2 (WebDriver driver) throws InterruptedException
	
	{
		
	WebElement element5 = driver.findElement(By.name("substring"));
	
	
	element5.sendKeys("apple");
	
	Thread.sleep(2000);
	
	element5.clear();
	
	

}
public static void search3 (WebDriver driver) throws InterruptedException
	
	{
		
	WebElement element6 = driver.findElement(By.id("request-personal-demo-button"));
	
	element6.click();
	
	
	Thread.sleep(3000);

	}	
}
