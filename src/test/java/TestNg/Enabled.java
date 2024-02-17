package TestNg;

import org.testng.annotations.Test;

public class Enabled {
  @Test(enabled=true)
  public void f() {
	   System.out.println("This  is the first test case");
  }
  @Test
  public void show()
  {
	  System.out.println("This is my 2nd test case");
  }
  @Test
  public void get()
  {
	  System.out.println("This is my 3rd test cases");
  }
  
  
  
  
  }
