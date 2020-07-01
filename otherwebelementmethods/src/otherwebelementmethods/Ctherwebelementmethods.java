package otherwebelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ctherwebelementmethods {

	public static void main(String[] args) throws InterruptedException 
	{
	       WebDriver driver = new ChromeDriver();
			
	        driver.manage().window().maximize();// manages the windows and maximizes
			
			driver.get("https://demostore.x-cart.com/");// open the website 
			
			Thread.sleep(2000);
			WebElement element = driver.findElement(By.cssSelector("input[placeholder= 'Search items...']")); 
			/// we are storing the info of the search in the WebElement element
			
			
			element.sendKeys("iphone");
			Thread.sleep(2000);
			element.clear(); /// clears the iphone text in the search bar and it will change to andriod
			element.sendKeys("andriod"); /// type the new word andriod into the search bar
			Thread.sleep(2000);
			driver.quit();

	}

}
