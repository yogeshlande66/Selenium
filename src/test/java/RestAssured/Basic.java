package RestAssured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Basic {
  @Test
  public void f() {
	   /*Response res=RestAssured.get("https://reqres.in/api/users?page=2");
	   int i=res.getStatusCode();
	   String s=res.getBody().asString();
	   System.out.println("Body data:"+s);
	   System.out.println("The staus Code should be 200:"+i);
	  */
	    RestAssured.given()
	    .when().get("https://reqres.in/api/users?page=2").
	    then().	
	    assertThat().
	    statusCode(200);
	    
	    
	    
	   
     	
			
	
	 
	
	 
	  
  }
}
