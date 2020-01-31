package SeleniumGrid;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;

public class CrossBrowserTest {
  
	public WebDriver driver;
	public String URL = "https://www.seleniumeasy.com/test/";
		

	@Parameters({ "browserType" })
	@BeforeTest
	public void launchbrowser(String browserType) throws MalformedURLException {
		

		if (browserType.equalsIgnoreCase("firefox")) {
			System.out.println(" Crossbrowser Executing on FireFox");
			System.setProperty("webdriver.gecko.driver","C:\\Users\\U35035\\eclipse-workspace\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			driver=new FirefoxDriver();


		} else if (browserType.equalsIgnoreCase("chrome")) {
			System.out.println(" Crossbrowser Executing on CHROME");
			System.setProperty("webdriver.chrome.driver","C:\\Users\\U35035\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();

		} else {
			throw new IllegalArgumentException("The Browser Type is Undefined");
		}
	}

	@Test
	public void SeleniumFormTest() throws Exception {
		
		
		// Launch website
		driver.navigate().to(URL);
		driver.manage().window().maximize();
				
		//Click Input forms
		driver.findElement(By.xpath("//*[@id=\"treemenu\"]/li/ul/li[1]/a")).click();
		Thread.sleep(3000);
		
		//Click Simple form demo
		driver.findElement(By.xpath("//*[@id=\"treemenu\"]/li/ul/li[1]/ul/li[1]/a")).click();
		Thread.sleep(3000);
		
		//Enter message
		Thread.sleep(3000);
		driver.findElement(By.id("user-message")).sendKeys("Hello world");
		Thread.sleep(3000);
		
		//Click show message button
		driver.findElement(By.xpath("//*[@id=\"get-input\"]/button")).click();
		Thread.sleep(3000);
	}

	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}

}
