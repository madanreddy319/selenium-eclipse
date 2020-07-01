package textng;

import org.testng.annotations.Test;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class Testng_annotation 

{
	@BeforeSuite
	public void beforeSuite() throws Exception
	{
		System.out.println("Invoking before suite method");
	}


@Test
public void fun1()
{
	System.out.println("Invoking first method");
}

@AfterSuite
public void afterSuite()throws Exception
{
	System.out.println("Invoking after Suite method");
}

}
