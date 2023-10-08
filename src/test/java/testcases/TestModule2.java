package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestModule2 {
	
 public static  WebDriver driver;
   public  String name;
	
	
	@Test(priority=1)
	public void facebookLogin()
	{
	
		driver = new EdgeDriver();
		WebDriverManager.edgedriver().setup();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");

		
	}
	
	@Test(priority=2)
	public void enterUserCredentials()
	{
		
		driver.findElement(By.id("email")).sendKeys("test123@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("testpassword");
	}

}
