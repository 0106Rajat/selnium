package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;


public class Demo {
	
	public static String browser = "firefox";
	//private static RemoteWebDriver driver;
	private static WebDriver driver;

	public static void main(String[] args) {
		
		if(browser.equals("chrome")) {
			driver = new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		driver.get("https://gmail.com");
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		//String expectedTitle = "Google";
		String expectedTitle = "Gmail";
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Test case pass.");
		}else {
			System.out.println("Test case failed.");
		}
		//driver.close(); //close the current browser
		//driver.quit(); //close all browsers and kills session
	}

}
