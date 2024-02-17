package TestNg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {
  @Test
  @Parameters({"username","password"})	
  public void f(String username,String pass) {
	  System.out.println(username);
	  System.out.println(pass);
	
  }
}
