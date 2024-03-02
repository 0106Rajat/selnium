package testcase67;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.support.locators.RelativeLocator;

public class TestBasicAuth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		//ChromeDriver driver = new ChromeDriver();
		//driver.register(UsernameAndPassword.of("admin","admin"));
		((HasAuthentication) driver).register(UsernameAndPassword.of("admin", "admin"));		
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		//driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//WebElement near = driver.findElement(RelativeLocator.with(By.partialLinkText("Basic Auth")).near(By.linkText("Add/Remove Elements")));
		//near.click();

	}

}
