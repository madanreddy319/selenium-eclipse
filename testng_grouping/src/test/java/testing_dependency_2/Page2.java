package testing_dependency_2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import testng_dependent.Page1;

public class Page2 
{
	private WebDriver driver;
	

@BeforeMethod (alwaysRun = true)

public void setUp()throws Exception
{
	driver = new ChromeDriver();
	driver.manage().window().maximize();	
}
@Test(groups = {"first"})

public void fun1()throws InterruptedException
{
	driver.get("https://www.facebook.com/");
	Page1.id(driver);
	Page1.Pass(driver);
	Page1.login(driver);
	
}
@Test
public void fun2()throws InterruptedException
{
	driver.get("https://www.facebook.com/");
	Page1.id(driver);
	Page1.Pass(driver);
	Page1.login(driver);
System.out.println("this is second function");	
}

@Test(groups = {"second"})
public void fun3()throws InterruptedException
{
	driver.get("https://www.facebook.com/");
	Page1.id(driver);
	Page1.Pass(driver);
	Page1.login(driver);
	
}
@AfterMethod (alwaysRun = true)

public void teardown() throws Exception
{
	driver.quit();
}

}
