package RestAssured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class Get_Method {
  @Test
  
  public void f() {
	  
	  Response res =RestAssured.get("https://reqres.in/api/users?page=2");
	   int n=res.statusCode();
	  System.out.println("status code should be:"+n);
	   System.out.println("The time is :"+res.getTime());
	    
	     
	  
	     
	    
	      
	      
	     
	     
	      
	     
	 
	     
	    
	     
	     
	     
	  
  }
}
