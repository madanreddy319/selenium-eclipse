package testng_dependent;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Page1 
{

	public static void Previous_Company (WebDriver driver) throws InterruptedException
	
	{
		
		
		WebElement element1 = driver.findElement(By.cssSelector("input[placeholder= 'Previous Company Name']"));
	
	
	element1.sendKeys("archeesh");
	
	Thread.sleep(2000);
	
	}
public static void Current_Company (WebDriver driver) throws InterruptedException
	
	{
		
		
		WebElement element1 = driver.findElement(By.cssSelector("input[placeholder= 'Current Company Name']"));
	
	
	element1.sendKeys("Null");
	
	Thread.sleep(2000);
	
	}
	


public static void date (WebDriver driver) throws InterruptedException

{
	
	{
		WebElement element1 = driver.findElement(By.cssSelector("input[name = 'bday']"));

		Thread.sleep(2000);

		element1.sendKeys("31/05/1993");

		Thread.sleep(2000);
		}


	
}


public static void join_date (WebDriver driver) throws InterruptedException

{
WebElement element1 = driver.findElement(By.cssSelector("input[id = 'profession-0']"));

Thread.sleep(2000);

element1.click();

Thread.sleep(2000);
}

public static void submit (WebDriver driver) throws InterruptedException

{
WebElement element1 = driver.findElement(By.className("kc_button primary_button"));

Thread.sleep(2000);

element1.click();

Thread.sleep(2000);
}
public static void service (WebDriver driver) throws InterruptedException

{
	
	Actions action = new Actions(driver);
	
	WebElement element1 = driver.findElement(By.cssSelector(".nav-link dropdown-item dropdown-toggle"));
	
	action.moveToElement(element1).build().perform();

	Thread.sleep(2000);

	WebElement element2 = driver.findElement(By.linkText("Performance Testing Services"));

Thread.sleep(2000);

element2.click();

}


}
