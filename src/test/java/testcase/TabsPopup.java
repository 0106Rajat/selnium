package testcase;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabsPopup {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://sso.teachable.com/secure/673/identity/sign_up");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

		System.out.println("-----Printing window ids from the first window-----");
		//https://stackoverflow.com/questions/70491775/driver-getwindowhandles-behaviour
		
		Set<String> winids = driver.getWindowHandles();
		Iterator<String> iterator = winids.iterator();
		
		String first_window = iterator.next();
		System.out.println(first_window);
		
		driver.findElement(By.linkText("Privacy Policy")).click();
		
		System.out.println("-----Printing window ids from the second window-----");
		
		/*
		 * while(iterator.hasNext()) {
		 * iterator.next(); }
		 */
		
		winids = driver.getWindowHandles(); //2
		iterator = winids.iterator();
		
		System.out.println(iterator.next());
		String second_window = iterator.next();
		System.out.println(second_window);
		
		driver.switchTo().window(second_window);
		
		driver.findElement(By.xpath("//*[@id=\"header-sign-up-btn\"]")).click();
		
		driver.findElement(By.linkText("Log in")).click();
		driver.switchTo().window(first_window);
		/*
		driver.close();//2nd window
		
		driver.switchTo().window(first_window);
		
		driver.close();
		*/
		//driver.quit();	
	}
}
