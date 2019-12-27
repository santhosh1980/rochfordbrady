package CaptureScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hpsf.Date;
import org.apache.poi.hwpf.usermodel.DateAndTime;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class lawlinkscreenshot {
	
	@Test
	
	public void screenshot() throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\U35035\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//String dat;
		
		//dat=new java.util.Date().toString();
		
		Calendar calendar = Calendar.getInstance();
		driver.manage().window().maximize();
		
		//base url
		
		String baseurl="https://qa.lawlink.ie";
		
		driver.get(baseurl);

		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File source=ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(source, new File("./screenshot/lawlink"+calendar.getTimeInMillis()+".png"));
		
		System.out.println("screenshot taken");
		
		driver.quit();
		
		
		
		
		
		
		
		
	}
	

}
