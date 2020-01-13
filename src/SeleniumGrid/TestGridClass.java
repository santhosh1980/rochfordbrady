package SeleniumGrid;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;

public class TestGridClass {
  
	public WebDriver driver;
	public String URL, Node;
	protected ThreadLocal<RemoteWebDriver> threadDriver = null;

	@Parameters({ "browserType" })
	@BeforeTest
	public void launchbrowser(String browserType) throws MalformedURLException {
		String URL = "http://gmail.com";

		if (browserType.equalsIgnoreCase("firefox")) {
			System.out.println(" Executing on FireFox");
			String Node = "http://10.100.75.32:4444/wd/hub";
			DesiredCapabilities cap = DesiredCapabilities.firefox();
			cap.setBrowserName("firefox");

			driver = new RemoteWebDriver(new URL(Node), cap);
			// Puts an Implicit wait, Will wait for 10 seconds before throwing exception
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			// Launch website
			driver.navigate().to(URL);
			driver.manage().window().maximize();
		} else if (browserType.equalsIgnoreCase("chrome")) {
			System.out.println(" Executing on CHROME");
			DesiredCapabilities cap = DesiredCapabilities.chrome();
			cap.setBrowserName("chrome");
			String Node = "http://10.100.75.32:4444/wd/hub";
			driver = new RemoteWebDriver(new URL(Node), cap);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			// Launch website
			driver.navigate().to(URL);
			driver.manage().window().maximize();
		} else if (browserType.equalsIgnoreCase("ie")) {
			System.out.println(" Executing on IE");
			DesiredCapabilities cap = DesiredCapabilities.chrome();
			cap.setBrowserName("ie");
			String Node = "http://10.100.75.32:4444/wd/hub";
			driver = new RemoteWebDriver(new URL(Node), cap);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			// Launch website
			driver.navigate().to(URL);
			driver.manage().window().maximize();
		} else {
			throw new IllegalArgumentException("The Browser Type is Undefined");
		}
	}

	@Test
	public void GmailOperation() {
		
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("username");
		driver.findElement(By.xpath("//input[@id='Passwd']")).sendKeys("password");
	}

	@AfterTest
	public void closeBrowser() {
		// driver.quit();
	}

}
