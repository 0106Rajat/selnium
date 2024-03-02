package testnglearning8;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class testcase2 {
	
	@Test(groups = "functional")
	public void validateTitles() {
		//try{
		System.out.println("Beginning");
		String actualTitle = "yahoo.com";
		String expectedTitle = "google.com";

	/*
		if(expectedTitle.equals(actualTitle)) {
			
			System.out.println("Test case pass");
		}else {
			
			System.out.println("Test case fail");
		}*/
		
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(false,"Element not found hence failing the test");
		softAssert.assertEquals(actualTitle,expectedTitle);
		softAssert.fail("condition not met hance failing the test");
		
		System.out.println("End all test");
		
		//Reporter.log("Screenshot link");
		//Reporter.log("<a href="" target=\"_blank\">Screenshot link</a>");
		softAssert.assertAll();
		
	/*	Assert.assertEquals(actualTitle, expectedTitle);
		Assert.assertTrue(false,"Element not found hence failing the test");
		}catch(Throwable t) {
			Assert.fail(t.getMessage());
			}	*/
	}
}