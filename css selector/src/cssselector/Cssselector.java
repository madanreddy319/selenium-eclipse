package cssselector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cssselector {

	public static void main(String[] args)throws InterruptedException 
	{
		
        WebDriver driver = new ChromeDriver();
		
        driver.manage().window().maximize();// manages the windows and maximizes
		
		driver.get("https://demostore.x-cart.com/");// open the website 
		
		Thread.sleep(2000);
		
		///driver.findElement(By.cssSelector("#logo")).click();
		
		
		////driver.findElement(By.cssSelector("div#logo")).click();
		
		////driver.findElement(By.cssSelector("input[placeholder= 'Search items...']")).sendKeys("Apple AirPods");
		
		////driver.findElement(By.cssSelector("input[name= 'substring']")).sendKeys("Apple AirPods");
		
		///driver.findElement(By.cssSelector(".company-logo")).click();
		
		///driver.findElement(By.cssSelector("div.company-logo")).click();
		
		driver.findElement(By.cssSelector("div[class='company-logo']")).click();
		
		
		Thread.sleep(2000);
		
		driver.quit();

	}

}
