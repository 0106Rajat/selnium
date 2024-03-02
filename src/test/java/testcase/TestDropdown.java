package testcase;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		//ChromeDriver;
		//FirefoxDriver;
		//driver.navigate().to("http://www.tizag.com/htmlT/htmlselect.php");	
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/select")).sendKeys("Colorado -- CO");
	WebElement dropdown = 	driver.findElement(By.xpath("//*[@id=\"searchLanguage\"]"));
	
		Select select = new Select(dropdown);
		select.selectByVisibleText("Eesti");
		select.selectByValue("hi");	
		
/*		List<WebElement> values =  driver.findElements(By.tagName("option"));
		int n= values.size();
		//System.out.println(n);
		//System.out.println(values.get(0).getText());
		for(int i = 0; i<=n ; i++) {
			//System.out.println(values.get(i).getText());
			System.out.println(values.get(i).getAttribute("lang"));
		}*/
		
		
		/*System.out.println("Print Link Tag ");
		WebElement block = driver.findElement(By.xpath("//*[@id=\"www-wikipedia-org\"]/div[8]/div[3]"));
		List<WebElement> testlink = block.findElements(By.tagName("a")); 
		System.out.println(testlink.size());
		for(WebElement link: testlink) {
			System.out.println(link.getText()+"---URL is : " +link.getAttribute("href"));
		}*/
	}

}
