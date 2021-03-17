package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class Steps {
	
	WebDriver driver;
	
	String driverpath = "C:\\Users\\U35035\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe";
	
	

	@Given("^Open the Chrome and launch the application$")
	
	public void Open_the_Chrome_and_launch_the_application() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", driverpath);
		
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://demo.guru99.com/v4");
		
		Thread.sleep(5000);
		
	}
	
	@When("^Enter the Username and Password$")
	
	public void Enter_the_Username_and_Password() throws Exception {
		driver.findElement(By.name("uid")).sendKeys("username12");
		
	    driver.findElement(By.name("password")).sendKeys("password12");	
	    
	    Thread.sleep(5000);
	 	
	}
	
	@Then("^Reset the credential$")
	
	public void Reset_the_credential() throws Exception {
		
		driver.findElement(By.name("btnReset")).click();
		
		Thread.sleep(5000);
		
		driver.close();
	}
}
