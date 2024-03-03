package testnglearning8;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import extentlisteners.ExtentListeners;

public class TestExtentsReports {

	public ExtentSparkReporter htmlReporter; // create HTML files
	public ExtentReports extent; // Add config, system, test cases
	public ExtentTest test; // add logs for pass, fail, skip etc
/*
	@BeforeTest
	public void setUpReport() {
		
		htmlReporter = new ExtentSparkReporter("./reports/extent.html"); 
		htmlReporter.config().setEncoding("utf-8");
		htmlReporter.config().setDocumentTitle("Automation Results");
		htmlReporter.config().setReportName("Automation Test Results");
		htmlReporter.config().setTheme(Theme.STANDARD);
		
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("Automation Tester", "Rajat Gupta");
		extent.setSystemInfo("Build no", "w2a-12345");
		extent.setSystemInfo("Organization", "Self");
		
	}
*/	
	@Test
	public void loginTest() {
//		test = extent.createTest("User login Test");
		ExtentListeners.test.log(Status.INFO, "Entering username");
		ExtentListeners.test.log(Status.INFO, "Entering password");
		Assert.fail();
	}
	
	@Test
	public void userRegTest() {
	//	test = extent.createTest("User Reg Test");
		ExtentListeners.test.log(Status.INFO, "Entering username");
		ExtentListeners.test.log(Status.INFO, "Entering password");
		ExtentListeners.test.log(Status.INFO, "Clicking on Submit button");
	}
	
	@Test
	public void isSkip() {
	
		//test = extent.createTest("Skip Test");
		ExtentListeners.test.log(Status.INFO, "Entering username");		
		throw new SkipException("Skipping the test case");
	}
	
	@AfterTest
	public void endReport() {
		//use for the generate report
		extent.flush();
	}
	
/*	
	@AfterMethod
	public void updateResults(ITestResult result) {

		if (result.getStatus() == ITestResult.FAILURE)
		{
			String methodName = result.getMethod().getMethodName();
			Markup m = MarkupHelper.createLabel(methodName.toUpperCase()+ " Test case is Failed", ExtentColor.RED);
			test.fail(m);
		} 
		else if (result.getStatus() == ITestResult.SUCCESS) 
		{
			test.log(Status.PASS, "Test case passed Now");
			String methodName = result.getMethod().getMethodName();
			Markup m = MarkupHelper.createLabel(methodName.toUpperCase()+ " Test case is Passed", ExtentColor.GREEN);
			test.pass(m);
		} 
		else if (result.getStatus() == ITestResult.SKIP) 
		{
			test.skip("Test case skipped");
			String methodName = result.getMethod().getMethodName();
			Markup m = MarkupHelper.createLabel(methodName.toUpperCase()+ " Test case is Skipped", ExtentColor.AMBER);test.skip(m);
		}

	}*/
	
}
