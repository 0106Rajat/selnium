package testnglearning8;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCheckPresen {
	
	public static WebDriver driver;
	
	public static boolean isElementPresece(String id) {
		try{
		driver.findElement(By.id(id));
		return true;
		}
		catch(Throwable t){
			return false;
		}
	}

	public static void main(String[] args)
	{
		 
		driver = new ChromeDriver();
		driver.get("https://gmail.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		System.out.println(isElementPresece("identifierId"));
		//System.out.println(driver.findElement( By.id("identifierId123")).isDisplayed());
		
	}

}
