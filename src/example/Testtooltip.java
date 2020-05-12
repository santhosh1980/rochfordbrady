package example;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testtooltip {

	WebDriver driver;

	@Test
	public void TesttooltipResults() throws Exception {

		driver.manage().window().maximize();

		String baseurl = "https://www.guru99.com/";

		driver.get(baseurl);

		// List<WebElement> Testing =
		// driver.findElements(By.xpath("//*[@id=\"java_technologies\"]/li"));

		// List<WebElement> Testing =
		// driver.findElements(By.xpath("/html/body/div[2]/section[4]/div/div/div/div/div/div/div/div[1]/div/"));

		// List<WebElement> Testing =
		// driver.findElements(By.xpath(".//*[starts-with(@xpath,'/html/body/div[2]/section[4]/div/div/div/div/div/div/div/div[1]/div/ul[1]')]"));

		// int Testingcount = Testing.size();

		// Testing - 9

		for (int i = 1; i <= 9; i++) {

			String tooltip = driver.findElement(By
					.xpath("/html/body/div[2]/section[4]/div/div/div/div/div/div/div/div[1]/div/ul[1]/li[" + i + "]/a"))
					.getAttribute("title");

			String text = driver.findElement(By
					.xpath("/html/body/div[2]/section[4]/div/div/div/div/div/div/div/div[1]/div/ul[1]/li[" + i + "]/a"))
					.getText();

			if (!tooltip.equals(text)) {

				System.out.println("Tooltip is " + tooltip);

				System.out.println("Text is " + text);

			}

		}

		// Live projects - 13

		for (int i = 1; i <= 13; i++) {

			String tooltip = driver.findElement(By
					.xpath("/html/body/div[2]/section[4]/div/div/div/div/div/div/div/div[1]/div/ul[2]/li[" + i + "]/a"))
					.getAttribute("title");

			String text = driver.findElement(By
					.xpath("/html/body/div[2]/section[4]/div/div/div/div/div/div/div/div[1]/div/ul[2]/li[" + i + "]/a"))
					.getText();

			if (!tooltip.equals(text)) {

				System.out.println("Tooltip is " + tooltip);

				System.out.println("Text is " + text);

			}

		}

		// Performance Testing - 2

		for (int i = 1; i <= 2; i++) {

			String tooltip = driver.findElement(By
					.xpath("/html/body/div[2]/section[4]/div/div/div/div/div/div/div/div[1]/div/ul[3]/li[" + i + "]/a"))
					.getAttribute("title");

			String text = driver.findElement(By
					.xpath("/html/body/div[2]/section[4]/div/div/div/div/div/div/div/div[1]/div/ul[3]/li[" + i + "]/a"))
					.getText();

			if (!tooltip.equals(text)) {

				System.out.println("Tooltip is " + tooltip);

				System.out.println("Text is " + text);

			}

		}

		// SAP - 14

		for (int i = 1; i <= 14; i++) {

			String tooltip = driver.findElement(By
					.xpath("/html/body/div[2]/section[4]/div/div/div/div/div/div/div/div[2]/div/ul[1]/li[" + i + "]/a"))
					.getAttribute("title");

			String text = driver.findElement(By
					.xpath("/html/body/div[2]/section[4]/div/div/div/div/div/div/div/div[2]/div/ul[1]/li[" + i + "]/a"))
					.getText();

			if (!tooltip.equals(text)) {

				System.out.println("Tooltip is " + tooltip);

				System.out.println("Text is " + text);

			}

		}

		// Defect tools - 3

		for (int i = 1; i <= 3; i++) {

			String tooltip = driver.findElement(By
					.xpath("/html/body/div[2]/section[4]/div/div/div/div/div/div/div/div[2]/div/ul[2]/li[" + i + "]/a"))
					.getAttribute("title");

			String text = driver.findElement(By
					.xpath("/html/body/div[2]/section[4]/div/div/div/div/div/div/div/div[2]/div/ul[2]/li[" + i + "]/a"))
					.getText();

			if (!tooltip.equals(text)) {

				System.out.println("Tooltip is " + tooltip);

				System.out.println("Text is " + text);

			}

		}

		// Enterprise Testing - 3

		for (int i = 1; i <= 3; i++) {

			String tooltip = driver.findElement(By
					.xpath("/html/body/div[2]/section[4]/div/div/div/div/div/div/div/div[2]/div/ul[3]/li[" + i + "]/a"))
					.getAttribute("title");

			String text = driver.findElement(By
					.xpath("/html/body/div[2]/section[4]/div/div/div/div/div/div/div/div[2]/div/ul[3]/li[" + i + "]/a"))
					.getText();

			if (!tooltip.equals(text)) {

				System.out.println("Tooltip is " + tooltip);

				System.out.println("Text is " + text);

			}

		}

		// AI - 3

		for (int i = 1; i <= 3; i++) {

			String tooltip = driver.findElement(By
					.xpath("/html/body/div[2]/section[4]/div/div/div/div/div/div/div/div[3]/div/ul[1]/li[" + i + "]/a"))
					.getAttribute("title");

			String text = driver.findElement(By
					.xpath("/html/body/div[2]/section[4]/div/div/div/div/div/div/div/div[3]/div/ul[1]/li[" + i + "]/a"))
					.getText();

			if (!tooltip.equals(text)) {

				System.out.println("Tooltip is " + tooltip);

				System.out.println("Text is " + text);

			}

		}

		// Web - 19

		for (int i = 1; i <= 19; i++) {

			String tooltip = driver.findElement(By
					.xpath("/html/body/div[2]/section[4]/div/div/div/div/div/div/div/div[3]/div/ul[2]/li[" + i + "]/a"))
					.getAttribute("title");

			String text = driver.findElement(By
					.xpath("/html/body/div[2]/section[4]/div/div/div/div/div/div/div/div[3]/div/ul[2]/li[" + i + "]/a"))
					.getText();

			if (!tooltip.equals(text)) {

				System.out.println("Tooltip is " + tooltip);

				System.out.println("Text is " + text);

			}

		}

		// Test Management - 3

		for (int i = 1; i <= 3; i++) {

			String tooltip = driver.findElement(By
					.xpath("/html/body/div[2]/section[4]/div/div/div/div/div/div/div/div[3]/div/ul[3]/li[" + i + "]/a"))
					.getAttribute("title");

			String text = driver.findElement(By
					.xpath("/html/body/div[2]/section[4]/div/div/div/div/div/div/div/div[3]/div/ul[3]/li[" + i + "]/a"))
					.getText();

			if (!tooltip.equals(text)) {

				System.out.println("Tooltip is " + tooltip);

				System.out.println("Text is " + text);

			}

		}

		// Big data - 9

		for (int i = 1; i <= 9; i++) {

			String tooltip = driver.findElement(By.xpath(
					"/html/body/div[2]/section[4]/div/div/div/div/div/div/div/div[4]/div/ul[1]/li[" + i + "]/a"))
					.getAttribute("title");

			String text = driver.findElement(By.xpath(
					"/html/body/div[2]/section[4]/div/div/div/div/div/div/div/div[4]/div/ul[1]/li[" + i + "]/a"))
					.getText();

			if (!tooltip.equals(text)) {

				System.out.println("Tooltip is " + tooltip);

				System.out.println("Text is " + text);

			}

		}

		// Must learn - 15

		for (int i = 1; i <= 15; i++) {

			String tooltip = driver.findElement(By.xpath(
					"/html/body/div[2]/section[4]/div/div/div/div/div/div/div/div[4]/div/ul[2]/li[" + i + "]/a"))
					.getAttribute("title");

			String text = driver.findElement(By.xpath(
					"/html/body/div[2]/section[4]/div/div/div/div/div/div/div/div[4]/div/ul[2]/li[" + i + "]/a"))
					.getText();

			if (!tooltip.equals(text)) {

				System.out.println("Tooltip is " + tooltip);

				System.out.println("Text is " + text);

			}

		}

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
