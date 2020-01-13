package SeleniumGrid;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GridExample {
  
	@Parameters({ "browserType" })
  @Test
	public void mailTest(String browserType) throws Exception{
		DesiredCapabilities dr=null;
		RemoteWebDriver driver;
		
		if(browserType.equals("firefox")){
		dr=DesiredCapabilities.firefox();
		dr.setBrowserName("firefox");
		dr.setPlatform(Platform.WINDOWS);
	
		}else{
			dr=DesiredCapabilities.internetExplorer();
			dr.setBrowserName("iexplore");
			dr.setPlatform(Platform.WINDOWS);
		}
			
		driver=new RemoteWebDriver(new URL("http://10.100.75.32:4444/wd/hub"), dr);
		driver.navigate().to("http://gmail.com");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("username");
		driver.findElement(By.xpath("//input[@id='Passwd']")).sendKeys("password");
		driver.close();
}
}
