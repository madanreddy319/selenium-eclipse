package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Dropdown {

	public static void main(String[] args) throws InterruptedException
	
	{
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();// manages the windows and maximizes

		driver.get("https://www.toolsqa.com/automation-practice-form");
		
		Thread.sleep(2000);
		
		Select element = new Select(driver.findElement(By.id("continents")));
		
		
		
		element.selectByVisibleText("Australia");
		
		Thread.sleep(4000);
		
	

		driver.quit();

	}

}
