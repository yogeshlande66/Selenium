package TestNg;

import org.testng.annotations.Test;

public class test1 {
  @Test(priority=1)
  public void f() {
	  
System.out.println("First test case is pass");
  }
  @Test(priority=2)
   public void get()
   {
	  System.out.println("2nd test cases");
	   
   }
  @Test(priority=3)
  public  void show()
  {
	  System.out.print("Hi welcome to the class");
	  
  }
  
  
  
}
