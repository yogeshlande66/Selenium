package TestNg;

import org.testng.annotations.Test;

public class Invocation_CountTest {

  @Test(invocationCount=5)
  public void Invocation_CountTest() {
	  System.out.println("This s need to execute 5 Tomes");
	  
  }
  @Test(timeOut=2000)
  public void get() throws InterruptedException
  {
	  Thread.sleep(3000);
	  System.out.println("Test case is failed due to Thread.sleep method is taking more to load the element");
	  
  }
  @Test(enabled=false)
  public void skip()
  {
	  System.out.println("This si skip method");
  }
  @SepUpTestCase(skipped=false)
  public void f()
  {
	  System.out.println("This is my SetUpTestCase");
  }
}

  


