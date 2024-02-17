package TestNg_LoginProject;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.Writable;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtedsReports implements ITestListener
{
	public ExtentSparkReporter sparkReporter;
	public ExtentReports extentReport;
	public ExtentTest extentTest;
    
	public void onStart(ITestContext context)
	{
		sparkReporter=new ExtentSparkReporter(System.getProperty("user.dir") + "/report/Myreport.html");
		sparkReporter.config().setDocumentTitle("AutomationTestingReport");
		sparkReporter.config().setReportName("FunctionReport");
		sparkReporter.config().setTheme(Theme.STANDARD);
		
		extentReport=new ExtentReports();
		extentReport.attachReporter(sparkReporter);
		extentReport.setSystemInfo("Computer System","localhost");
		extentReport.setSystemInfo("Environment","QA");
	}
	public void onTestSuccess(ITestResult result)
	{
	extentTest=extentReport.createTest(result.getName());
	extentTest.log(Status.PASS,"Test case is passed:"+result.getName());
	}
	public void OnTestFailure(ITestResult result)
	{
		extentTest=extentReport.createTest(result.getName());
		extentTest.log(Status.FAIL,result.getName());
		extentTest.log(Status.FAIL,result.getThrowable());
	}
	public void onTestSkipped(ITestResult result)
	{
		extentTest=extentReport.createTest(result.getName());
		extentTest.log(Status.SKIP,result.getName());
	}
	public void onFinish(ITestContext context) 
	{		
		extentReport.flush();
		
		 
	}

}
	
	
	
	
