package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By.ByName;

public class AssignmentWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://way2automation.com/way2auto_jquery/index.php");
		driver.manage().window().maximize();	
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Jai Shree Ram"); // relative xpath
		//driver.findElement(By.xpath("//*[@id=\"load_box\"]//*[@id=\"load_form\"]/fieldset[1]/input")).sendKeys("Rajat Kumar");
		//driver.findElement(By.xpath("//*[@id=\"load_form\"]/fieldset[1]/input")).sendKeys("Rajat Gupta");

		
		//driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/form/fieldset[1]/input")).sendKeys("Rajat");
	//	driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/form/fieldset[2]/input")).sendKeys("1234567890");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/form/fieldset[3]/input")).sendKeys("rajat@ypmail.com");
		/*	WebElement dd = driver.findElement(By.xpath("//*[@id=\"load_form\"]/fieldset[4]"));
		Select select = new Select(dd);
		select.selectByVisibleText("Algeria");
		select.selectByValue("Algeria");
		*/
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/form/fieldset[5]/input")).sendKeys("Noida");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/form/fieldset[6]/input")).sendKeys("rajatclavis");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/form/fieldset[7]/input")).sendKeys("12345");
		
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/form/div[1]/div[2]/input")).click();
		
		
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Rama");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("3123123123");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Noida@gmail.com");
		driver.findElement(By.xpath("//select[@name='country']")).sendKeys("Noida");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Noida");
		driver.findElement(By.xpath("//div[@id='load_box']//input[@name='username']")).sendKeys("RRR");
		driver.findElement(By.xpath("//div[@id='load_box']//input[@name='password']")).sendKeys("123");
	
	}

}
