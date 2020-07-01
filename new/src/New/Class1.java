package New;

import org.openqa.selenium.WebDriver;


public class Class1 
{
	

	public static void main(String[] args) 
	{
		//System.setProperty("webdriver.gecko.driver", "/Users/madan\\ mohan\\ reddy/Desktop/geckodriver");
		WebDriver driver = new ChromeDriver();// creates an object for chrome driver
		driver.manage().window().maximize();// manages the windows and maximizes
		driver.get("https://testzenlabs.ie/");// open the website 
		Thread.sleep(5000);// present the website for 5 seconds
		driver.quit();// 
		// TODO Auto-generated method stub

	}

}
