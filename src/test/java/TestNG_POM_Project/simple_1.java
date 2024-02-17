package TestNG_POM_Project;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;


public class simple_1 implements ITestListener {
  @Test
  public void onTestStart(ITestResult  arg) {
	 
  }
  public void onTestSucess(ITestResult arg)
  {
	  System.out.print("test case is passed");
	  System.out.println(arg.getName());
	  
  }
  public void onTestFailure(ITestResult arg)
  {
	  System.out.println(arg.getName());	  
  }
  public void onTestCaseSkipped(ITestResult arg)
  {
	  System.out.println(arg.getName());
	  
  }
}
