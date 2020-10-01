package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class mysampletestng {
	
	 WebDriver driver;
  @Test
  
  
  public void mysampletestngresults() throws Exception {
	  
	  driver.manage().window().maximize();
	  
	  String baseurl = "http://demo.guru99.com/popup.php";
	  
	  driver.get(baseurl);
	  
	  driver.findElement(By.partialLinkText("Insurance")).click();
	  
	  Thread.sleep(5000);
	  
	  
  }
  
  @BeforeTest
	public void beforeTest() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\U35035\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
	}

	@AfterTest
	public void afterTest() {

		driver.close();

	}
}
