package firefoxbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefoxclass
{

	public static void main(String[] args) throws InterruptedException 
	{
		//System.setProperty("webdriver.gecko.driver", "/Users/madan\\ mohan\\ reddy/Desktop/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://testzenlabs.ie/");
		Thread.sleep(5000);
		driver.quit();
	}
	

}
