package TestNg;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MytestListners  implements ITestListener{

	 public void onTestStart(ITestResult result) {
 System.out.println("On test Start");
}
	 public void onTestSucess(ITestResult result) {
		 System.out.println("On test Sucess");

	 }
	 public void onTestFailure(ITestResult result) {
		 System.out.println("On test Failure");

	 }
	 
	 public void onTestSkipped(ITestResult result) {
		 System.out.println("On test Skipped");

	 }
	 public void OnFinish(ITestContext result) {
		 System.out.println("On test finish");

	 }
	 
	 
	 

}
