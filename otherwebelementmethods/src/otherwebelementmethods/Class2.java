package otherwebelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class2 {

	public static void main(String[] args) throws InterruptedException 
	
	{
		
		       WebDriver driver = new ChromeDriver();
				
		        driver.manage().window().maximize();// manages the windows and maximizes
				
				driver.get("https://www.google.com/");// open the website 
				
				Thread.sleep(2000);
				WebElement element = driver.findElement(By.cssSelector("input[class= 'gLFyf gsfi']")); 
				/// we are storing the info of the search in the WebElement element
				
				element.sendKeys("facebook");
				
				Thread.sleep(2000);
				
				////element.clear(); /// clears the facebook text in the search bar and it will change to twitter
				element.sendKeys(Keys.ENTER); /// ENTER THE text in the search bar by typing the text and press enter
				Thread.sleep(2000);
				driver.quit();

	

	}

}
