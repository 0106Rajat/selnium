package testnglearning8;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

@Test
public class testcase3 {
	
	@Test(priority = 1, groups= {"functional","bvt"})
	public void userRegTest() {
		System.out.println("Executing User Reg Test");
		Assert.fail("User registeration not successful");	
	}
	
	@Test(priority = 2, dependsOnMethods = "userRegTest", groups= {"functional","bvt"})
	public void doLogin() {
		System.out.println("Executing Login Test");
	}
	
	@Test(priority = 3, groups= "bvt")
	public void isSkip() {
		throw new SkipException("contion not met hence skip the test");
	}
}