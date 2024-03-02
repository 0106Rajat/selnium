package testnglearning8;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testcase1 {
	
	@BeforeTest
	public void createDBConn() {
		System.out.println("Create DB connection");
	}
	
	@AfterTest
	public void closeDBConn() {
		System.out.println("Close DB connection");
	}
	
	@BeforeMethod
	public void launchBrowser() {
		System.out.println("Launch the Browser");
	}
	
	@AfterMethod
	public void closeBrowser() {
		System.out.println("Close the Browser");
	}
	
	@Test(priority = 1, groups= "bvt")
	public void userRegTest() {
		System.out.println("Add new user");
	}
	
	@Test(priority = 2, groups= "functional")
	public void doLogin() {
		System.out.println("Test ng test here");
	}
}
