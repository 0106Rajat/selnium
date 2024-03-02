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

public class TestProperties1 {
	
	public static WebDriver driver;
	public static Properties OR = new Properties();
	public static Properties config = new Properties();
	public static FileInputStream fis;
	public static WebDriverWait wait;
	public static Logger log = Logger.getLogger(TestProperties.class);
	
	public static void main(String[] args) throws IOException {
		
		PropertyConfigurator.configure(".\\src\\test\\resources\\properties\\log4j.properties");
		//Logger.getLogger(TestProperties.class).info("--test case--");
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
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Integer.parseInt(config.getProperty("implicit.wait"))));
		
		driver.findElement(By.id(OR.getProperty("username_ID"))).sendKeys("trainer@way2automation.com");
		log.info("");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(OR.getProperty("nextBtn_XPATH")))).click();
		log.info("Clickling on the next button");
		
		//driver.findElement(By.xpath(OR.getProperty("nextBtn_XPATH"))).click();
		
		//driver.findElement(By.id(OR.getProperty("username_ID")))
		System.out.println(OR.getProperty("username_ID"));
		
		//driver.get(config.getProperty("testsiteurl"))
		System.out.println(config.getProperty("testsiteurl"));
		log.info("---Test execution completed----");
	}

}
