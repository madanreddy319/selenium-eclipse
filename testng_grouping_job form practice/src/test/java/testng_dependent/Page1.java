package testng_dependent;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Page1 
{
public static void service (WebDriver driver) throws InterruptedException

{
	Actions action = new Actions(driver);


WebElement element1 = driver.findElement(By.name(".bday"));

action.moveToElement(element1).build().perform();

Thread.sleep(2000);

element1.sendKeys("31/05/1993");




}


}
