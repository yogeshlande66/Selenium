package RestAssured;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Post_ {
  @Test
  public void f() {
	  
	 HashMap map=new HashMap();
	   map.put("na","morpheus");
	   map.put("job","leader");   
	try {
	 RequestSpecification rest=RestAssured.given();
	 
	 Response res=
	
		   rest.body(map)
		   .when()
		   .post("https://reqres.in/api/register")
		   .then()
		   .statusCode(200)
		   .extract().response();
	 String s= res.getBody().asString();
	  int i=res.statusCode();
	  System.out.println("The Status code be :"+i);
	  System.out.println(s);
	  
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	
	
  }
}
