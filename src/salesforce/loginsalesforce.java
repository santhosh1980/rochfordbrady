package salesforce;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class loginsalesforce {
	
	WebDriver driver;
	
	@BeforeTest
	public void beforetest() {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\U35035\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://test.salesforce.com/");
		
	}
	
	@AfterTest
	public void aftertest() {
		
		driver.quit();
	}
	@Test (priority=0)
	public void logintest() {
		
		driver.findElement(By.id("username")).sendKeys("rbguser@rochfordbrady.ie.uatrbg");
		
		driver.findElement(By.id("password")).sendKeys("AxzSRzJwSRDaS4E");
		
		driver.findElement(By.id("Login")).click();
	}
	
	@Test (priority=1)
	public void logouttest() {
		
		driver.findElement(By.linkText("Log Out")).click();
		
		
	}
}
