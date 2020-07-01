package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
       WebDriver driver = new ChromeDriver();
		
        driver.manage().window().maximize();// manages the windows and maximizes
		
		driver.get("https://demostore.x-cart.com/");// open the website 
		
		Thread.sleep(2000);
		
		////driver.findElement(By.xpath(".//a[contains(text(),'Create your store')]")).click();
		
		driver.findElement(By.xpath(".//a[text()='Create your store']")).click();
		
		Thread.sleep(2000);
		
		driver.quit();
	}

}
