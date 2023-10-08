package utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;

import testcases.TestModule2;

public class Listeners extends TestModule2 implements  ITestListener {
	
	ExtentReports extent;
	


	@Override
	public void onTestStart(ITestResult result) {
	  
		if(extent==null)
		{
		
		extent=	ExtentReportsConfiguration.getReportConfiguration();
		}
	
		
		
		extent.createTest(result.getMethod().getMethodName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		// 10 testcases
		System.out.println("test case got passed successfully");
		
	}

	// 10 testcases , 3 testcases got failed
	
	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("test case got failed");
		System.out.println(result.getMethod().getMethodName());
	
		
		//way1
//		TestModule2 tm2 = new TestModule2();
//		tm2.driver;
		
		
	//	way2
		// static variables or methods
		// classname.variablename
		
		//way3
		//extends keyword
		
		
		
		TakesScreenshot tks = (TakesScreenshot)driver;
	File sourceLocation=	tks.getScreenshotAs(OutputType.FILE);
	
	
	
	String path=System.getProperty("user.dir")+"//FailedScreenshot//"+result.getMethod().getMethodName()+".png";
	
	File destinationLocation= new File(path);
	
		//File destinationLocation = new File("D:\\FailedScreenhots\\failedtest.png");
		
		try {
			FileUtils.copyFile(sourceLocation, destinationLocation);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	}

	@Override
	public void onStart(ITestContext context) {
		
		System.out.println("Test cases are about to start");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
		
		extent.flush();
		
	}

	

}
