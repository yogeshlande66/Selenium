package TestNg;

import org.testng.annotations.Test;





public class alwaysRun1 {
	
  @Test
  public void f() {
	  
	  System.out.println("This is the f mthod");
	
  }
  
  
  @Test(dependsOnMethods= {"f"},alwaysRun=true)
public void put() {
	  
	  System.out.println("This is the Put mthod");
  }

  
@Test(dependsOnMethods= {"put"})
public void get() {
	  
	  System.out.println("This is the Put mthod");
}
public void show() {
	  
	  System.out.println("This is the show mthod");
}
}
 

