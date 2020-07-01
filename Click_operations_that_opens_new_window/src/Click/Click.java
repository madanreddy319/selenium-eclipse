package Click;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Click {

	public static void main(String[] args) throws InterruptedException
	{
	// create a project of chrome driver
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();// manages the windows and maximizes

		driver.get("https://demostore.x-cart.com/");
		
		Thread.sleep(2000);
		
		/// create a variable element 
		
		WebElement element = driver.findElement(By.linkText("Create your store"));
		
		Thread.sleep(2000);
		
		String winhandlebefore = driver.getWindowHandle();
		
		element.click();
		
		Thread.sleep(2000);
		//switch to new window opened
		
		//enhanced for loop
		for(String winHandle  : driver.getWindowHandles())
			
		{
			driver.switchTo().window(winHandle);
		}
		//perform the actions on new windows
		
		WebElement element1 = driver.findElement(By.name("email"));
		
		element1.sendKeys("madanreddy319@gmail.com");
		
		Thread.sleep(3000);
		///close the new window, if that window no more required
		driver.close();
		
		Thread.sleep(3000);
		
		//switch back to orginal browser(first window)
		
		driver.switchTo().window(winhandlebefore);
		
		
	
		
		Thread.sleep(3000);
		
		
		
		/// do an action in previous window by entering the placeholder
		
		
		
		driver.findElement(By.cssSelector("input[placeholder= 'Search items...']")).sendKeys("Apple AirPods");
		
		Thread.sleep(3000);
		
		driver.quit();
		
	}

}
