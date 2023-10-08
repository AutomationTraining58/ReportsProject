package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsConfiguration {
	
	
	
	
	
	public static  ExtentReports getReportConfiguration()
	{
		
		// ExtentSparkReporter   //ExtentReports
		
     String reportsPath=	System.getProperty("user.dir")+"\\reports\\index2.html";
		
		ExtentSparkReporter reporter = new ExtentSparkReporter(reportsPath);
		
		reporter.config().setReportName("Automation Test Report");
		
		
		// ExtentReports
		
	ExtentReports	extentReport= new ExtentReports();
		
		extentReport.attachReporter(reporter);
		
		
		return extentReport;
		
		
		
		
		
	}

}
