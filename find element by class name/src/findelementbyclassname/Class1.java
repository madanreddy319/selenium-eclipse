package findelementbyclassname;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Class1 
{
	

	public static void main(String[] args)throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();// creates an object for chrome driver
		
		driver.manage().window().maximize();// manages the windows and maximizes
		
		driver.get("https://www.facebook.com/");// open the website 
		
		
		List<WebElement> elements1 = driver.findElements(By.className("inputtext"));
		
		
		elements1.get(0).sendKeys("madanreddy319@gmail.com");
		
		Thread.sleep(2000);
		
		List<WebElement> elements2 = driver.findElements(By.className("inputtext"));
		
		
		elements2.get(1).sendKeys("madan319");
		
		
		Thread.sleep(2000);
		
		
		WebElement element3 = driver.findElement(By.id("u_0_b"));
		
		element3.click();
		
		Thread.sleep(5000);// present the website for 5 seconds
		
		driver.quit();// 
		

	}

}
