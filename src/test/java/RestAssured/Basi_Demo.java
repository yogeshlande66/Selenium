package RestAssured;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestLogSpecification;
import io.restassured.specification.RequestSpecification;

public class Basi_Demo {
	
	  	@Test
	  	public void get()
	  	{
	  		/*HashMap<String,String> m=new HashMap<>();
	  	     m.put("email", "eve.holt@reqres.in");
	  	     m.put("password", "pistol");
	  	
	  	try
	  	{
	  	 RequestSpecification rest=RestAssured.given();
		 
		 Response res=
				body(m)
			   .when()
			   .post("https://reqres.in/api/users")
			   .then()
			   .statusCode(200)
			   .log().all()
			   .extract().response();
		 String s= res.getBody().asString();
		  int i=res.statusCode();
		  System.out.println("The Status code be :"+i);
		  System.out.println(s);
		  
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	*/
	  		
	  	
	  	
	  	
	  
	  	
	  			
	  			
	  	  
	  	  
	  	
	  	     
	  		
	  		
	  		
	  	/*	Response res =(Response) rest.given()
			.when().get("https://reqres.in/api/users?page=2").then().log().all();
	  		
	  	   int i=res.statusCode();
	  	 
	  		String s= res.getBody().asString();
	  		
	  		System.out.println(s);*/
	  		
	  		
	  		
	  			
	  		
	  	Response res=(Response) RestAssured.given()
	  	
	  	
	  	 .when().get("https://reqres.in/api/users?page=2")
	  	  .then().statusCode(200).log().all();
	  	  System.out.println(res.statusCode());	  	  System.out.println(res.getBody().asString());
}	

		private Object RestAssured() {
			// TODO Auto-generated method stub
			return null;
		}
}
