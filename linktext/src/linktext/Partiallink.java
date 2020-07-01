package linktext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Partiallink {

	public static void main(String[] args) throws InterruptedException 
	
	{
		
		WebDriver driver = new ChromeDriver();
		
        driver.manage().window().maximize();// manages the windows and maximizes
		
		driver.get("https://demostore.x-cart.com/");// open the website 
		
		Thread.sleep(2000);
		
	driver.findElement(By.partialLinkText("Ship")).click();
		
	Thread.sleep(2000);
	
	driver.findElement(By.partialLinkText("New!")).click();
	
	Thread.sleep(2000);
	
	driver.findElement(By.partialLinkText("Coming")).click();
	
	Thread.sleep(2000);
	
	driver.findElement(By.partialLinkText("Contact")).click();
	
	Thread.sleep(2000);
	
	
	driver.quit();

	}




	{
		

	}

}
