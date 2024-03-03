package extentlisteners;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {
	
	private static ExtentReports extent;
	public static String fileName;
	
	
	public static ExtentReports createInstance(String fileName) {
		
		ExtentSparkReporter htmlReporter = new ExtentSparkReporter(fileName);
		
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
		
		return extent;
		
	}

}
