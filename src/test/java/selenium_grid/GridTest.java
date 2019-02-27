package selenium_grid;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GridTest {

	private static DesiredCapabilities capabillities;
	

	@BeforeMethod
	public void bmethod() {
		System.out.println("Before Method");

	}

	@AfterMethod
	public void amethod() {
		System.out.println("After Method");

	}
	
	@AfterTest
	public void atest() {
		System.out.println("After Test");
	}

	@Test
	public static void am() throws MalformedURLException {

		System.out.println("Start of first test");

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Grid\\chromedriver");

		capabillities = DesiredCapabilities.chrome();

		WebDriver driver= new RemoteWebDriver(new URL("http://192.168.99.100:4444/wd/hub"), capabillities);

		driver.get("http://www.google.com");
		System.out.println("Before browser close");
		driver.close();
		driver.quit();
		System.out.println("End of first test");
	}

	@Test
	public static void bm() throws MalformedURLException {
		System.out.println("Start of second test");

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Grid\\chromedriver");

		capabillities = DesiredCapabilities.chrome();

		WebDriver driver1 = new RemoteWebDriver(new URL("http://192.168.99.100:4444/wd/hub"), capabillities);

		driver1.get("http://www.google.com");
		System.out.println("Before browser close");
		driver1.close();
		driver1.quit();
		System.out.println("End of second test");
	}

	@Test
	public static void cm() throws MalformedURLException {
		System.out.println("Start of third test");

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Grid\\chromedriver");

		capabillities = DesiredCapabilities.chrome();

		WebDriver driver2 = new RemoteWebDriver(new URL("http://192.168.99.100:4444/wd/hub"), capabillities);

		driver2.get("http://www.google.com");
		System.out.println("Before browser close");
		driver2.close();
		driver2.quit();
		System.out.println("End of third test");
	}

	@Test
	public static void dm() throws MalformedURLException {
		System.out.println("Start of forth test");

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Grid\\chromedriver");

		capabillities = DesiredCapabilities.chrome();

		WebDriver driver3 = new RemoteWebDriver(new URL("http://192.168.99.100:4444/wd/hub"), capabillities);

		driver3.get("http://www.google.com");
		System.out.println("Before browser close");
		driver3.close();
		driver3.quit();
		System.out.println("End of forth test");
	}

	@Test
	public static void em() throws MalformedURLException {
		System.out.println("Start of fifth test");

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Grid\\chromedriver");

		capabillities = DesiredCapabilities.chrome();

		WebDriver driver4 = new RemoteWebDriver(new URL("http://192.168.99.100:4444/wd/hub"), capabillities);

		driver4.get("http://www.google.com");
		System.out.println("Before browser close");
		driver4.close();
		driver4.quit();
		System.out.println("End of fifth test");
	}

}
