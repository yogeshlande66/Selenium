package TestNG_POM_Project;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.annotations.Test;

public class Customer implements ITestListener {
	
public  void  onTestStart(ITestContext arg)
{
	System.out.println("This is the start");
	
}
public void onTestSucess(ITestContext arg)
{
	System.out.print("This is the test sucess");
	
}
}

