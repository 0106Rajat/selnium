package testcase;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

	public class TestRightClick {

		public static void main(String[] args) {

			WebDriver driver = new ChromeDriver();
			driver.get("https://deluxe-menu.com/popup-mode-sample.html");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			WebElement img =  driver.findElement(By.xpath("//img[@src='data-samples/images/popup_pic.gif']"));
			new Actions(driver).contextClick(img).perform();
			
		}
	}