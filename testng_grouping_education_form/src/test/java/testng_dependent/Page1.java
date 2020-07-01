package testng_dependent;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Page1 
{
	public static void Primary (WebDriver driver) throws InterruptedException
	
	{
		
		
		WebElement element1 = driver.findElement(By.cssSelector("input[placeholder= 'Primary School Name']"));
	
	
	element1.sendKeys("Model Mission High School");
	
	Thread.sleep(2000);
	
	}
	
	public static void Secondary (WebDriver driver) throws InterruptedException
	
	{
		
		WebElement element2 = driver.findElement(By.cssSelector("input[placeholder= 'Secondary School Name']"));
	
	
	element2.sendKeys("Model Mission High School");
	
	
	Thread.sleep(2000);
	
	}
public static void Intermediate(WebDriver driver) throws InterruptedException
	
	{
		
		
		WebElement element1 = driver.findElement(By.cssSelector("input[placeholder= 'Intermediate College Name']"));
	
	
	element1.sendKeys("sri");
	
	Thread.sleep(2000);
	
	}
public static void Engineering (WebDriver driver) throws InterruptedException

{
	
	
	WebElement element1 = driver.findElement(By.cssSelector("input[placeholder= 'Engineering College Name']"));


element1.sendKeys("B-tech");

Thread.sleep(2000);

}
public static void University (WebDriver driver) throws InterruptedException

{
	
	
	WebElement element1 = driver.findElement(By.cssSelector("input[placeholder= 'University Name']"));


element1.sendKeys("JNTU");

Thread.sleep(2000);

}
public static void University_Percentage (WebDriver driver) throws InterruptedException

{
	
	
	WebElement element1 = driver.findElement(By.cssSelector("input[placeholder= 'University Percentage']"));


element1.sendKeys("University Percentage");

Thread.sleep(2000);

}


}
