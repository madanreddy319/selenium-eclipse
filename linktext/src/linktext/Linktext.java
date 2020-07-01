package linktext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktext 
{
	/// if we are having a href we need to use the link text option

	public static void main(String[] args) throws InterruptedException 
	
	{
		
		WebDriver driver = new ChromeDriver();
		
        driver.manage().window().maximize();// manages the windows and maximizes
		
		driver.get("https://demostore.x-cart.com/");// open the website 
		
		Thread.sleep(2000);
		
	driver.findElement(By.linkText("Shipping")).click();
		
	Thread.sleep(2000);
	
	driver.findElement(By.linkText("New!")).click();
	
	Thread.sleep(2000);
	
	driver.findElement(By.linkText("Coming soon")).click();
	
	Thread.sleep(2000);
	
	driver.findElement(By.linkText("Contact us")).click();
	
	Thread.sleep(2000);
	
	
	driver.quit();

	}

}





