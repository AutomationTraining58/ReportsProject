package testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class TestModule1 {
	

	
	
	
	
	@Test(priority=1)
	public void testcase1()
	{
		
		
		System.out.println("testcase1 got executed");
		
	}
	
	@Test(priority=2)
	public void testcase2()
	{
		
		
		System.out.println("testcase2 got executed");
		
	}
	
	@Test(priority=3)
	public void testcase3()
	{
		
		System.out.println("testcase3 got executed");
		
	}
	
	
	

}
