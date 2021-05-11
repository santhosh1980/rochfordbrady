package StepDefinition;

import static org.testng.AssertJUnit.assertTrue;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;



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
	
	@When("^Enter valid Username and Password$")
	
	public void Enter_valid_Username_and_Password() throws Exception {
		driver.findElement(By.name("uid")).sendKeys("1303");
		
	    driver.findElement(By.name("password")).sendKeys("Guru99");	
	    
	    Thread.sleep(5000);
	 	
	}
	
	@When("^Enter Invalid Username and Password$")
	
	public void Enter_Invalid_Username_and_Password() throws Exception {
		driver.findElement(By.name("uid")).sendKeys("1303");
		
	    driver.findElement(By.name("password")).sendKeys("hello");	
	    
	    Thread.sleep(5000);
	 	
	}
	
	@Then("^Reset the credential$")
	
	public void Reset_the_credential() throws Exception {
		
		driver.findElement(By.name("btnReset")).click();
		
		Thread.sleep(5000);
		
		driver.close();
	}
	
	@And("^Click Login button$")
	
	public void Click_Login_button() throws Exception {
		
		driver.findElement(By.name("btnLogin")).click();
		
		Thread.sleep(5000);
		
		
	}
	
	@Then("^User successfully logged in$")
	
	public void User_successfully_logged_in() throws Exception {
		
		Assert.assertTrue("Welcome To Customer's Page of Guru99 Bank",true);
				
		driver.close();
	}
	
	@Then("^User not successfully logged in$")
	
	public void User_not_successfully_logged_in() throws Exception {
		
		Alert loginalert = driver.switchTo().alert();
		
		Assert.assertEquals("Alert Text NOT matches", "User or Password is not valid", loginalert.getText());
		
		loginalert.accept();
				
		driver.close();
	}
}
