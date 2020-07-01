package otherwebelementmethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehover {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();// manages the windows and maximizes

		driver.get("https://demostore.x-cart.com/");// open the website
		
		Actions action = new Actions(driver);

		List<WebElement> element1 = driver.findElements(By.cssSelector(".primary-title"));

		Thread.sleep(2000);

		action.moveToElement(element1.get(1)).build().perform();

		Thread.sleep(2000);

		WebElement element2 = driver.findElement(By.linkText("Sale"));

		Thread.sleep(2000);

		element2.click();

		driver.quit();

	

	}

}
