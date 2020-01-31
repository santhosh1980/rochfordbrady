package example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

public class asserttest {
	
	public static void main (String[] args) throws Exception{
		
		//assert test
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\U35035\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\U35035\\eclipse-workspace\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		
		
		//WebDriver driver = new ChromeDriver();
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://google.com"); 
		
		System.out.println(driver.getTitle());
		
		try {
			
			Assert.assertEquals("Google", driver.getTitle());
			
		}
		
		catch (Exception e) {
			System.out.println(e.getStackTrace());
			Assert.assertEquals("Google", driver.getTitle());
		}
			
		finally {
			driver.close();
		}
		
	}

}
