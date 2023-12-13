package PracticeForMAVEN;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.edge.EdgeDriverService;
import org.testng.Assert;
import org.testng.annotations.Test;



public class CreateContactDemoTest
{
	@Test
	public void m1Test()
	{
			WebDriverManager.edgedriver().setup();
			WebDriver driver = new EdgeDriver();
			driver.get("https://www.amazon.in");
			System.out.println("Amazon");
				
	}
	@Test
	public void m2Test()
	{
		System.out.println("Hello");
		System.out.println("Shiny");
		//Assert.assertEquals(false, true);
		System.out.println("Ingrid");
		System.out.println("Bye");
				
	}
	
}

