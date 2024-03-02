package testcase67;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.log4j.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestProperties {
	
	public static WebDriver driver;
	public static Properties OR = new Properties();
	public static Properties config = new Properties();
	public static FileInputStream fis;
	public static WebDriverWait wait;
	public static Logger log = Logger.getLogger(TestProperties.class);
	
	public static void click(String locatorkey) {
		if(locatorkey.endsWith("_XPATH")) {
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(OR.getProperty(locatorkey)))).click();
		}else if(locatorkey.endsWith("_ID")) {
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id(OR.getProperty(locatorkey)))).click();
		}else if(locatorkey.endsWith("_CSS")) {
			wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(OR.getProperty(locatorkey)))).click();
		}	
		log.info("Clickling on the" +locatorkey);
	}
	public static void type(String locatorkey, String value) {
		if(locatorkey.endsWith("_XPATH")) {
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(OR.getProperty(locatorkey)))).sendKeys(value);
		}else if(locatorkey.endsWith("_ID")) {
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id(OR.getProperty(locatorkey)))).sendKeys(value);
		}else if(locatorkey.endsWith("_CSS")) {
			wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(OR.getProperty(locatorkey)))).sendKeys(value);
		}
		log.info("Typing in "+ locatorkey +" and entered the value as" +value);
	}

	public static void main(String[] args) throws IOException {
		
		PropertyConfigurator.configure(".\\src\\test\\resources\\properties\\log4j.properties");
		log.info("--test case--");
		
		fis = new FileInputStream(".\\src\\test\\resources\\properties\\OR.properties");
		OR.load(fis);
		log.info("--OR property file lodded--");
		
		fis = new FileInputStream(".\\src\\test\\resources\\properties\\config.properties");
		config.load(fis);
		log.info("--config property file lodded--");
		
		if(config.getProperty("browser").equals("chrome")) {
			driver = new ChromeDriver();
			log.info("Chrome browser launched ");
		}
		else if(config.getProperty("browser").equals("firefox")) {
			driver = new FirefoxDriver();
			log.info("Firefox browser launched");
		}
		
		wait = new WebDriverWait(driver,Duration.ofSeconds(Integer.parseInt(config.getProperty("explicit.wait"))));

		driver.get(config.getProperty("testsiteurl"));
		log.info("Navigated to :"+config.getProperty("testsiteurl"));
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Integer.parseInt(config.getProperty("implicit.wait"))));
		
		type("username_ID","trainer@way2automation.com");
		click("nextBtn_XPATH");

		log.info("---Test execution completed----");
	}

}
