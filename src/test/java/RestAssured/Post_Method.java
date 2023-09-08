package RestAssured;

import java.util.HashMap;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;
import io.restassured.specification.RequestSpecification;
import net.bytebuddy.NamingStrategy.Suffixing.BaseNameResolver.ForGivenType;

public class Post_Method {
  @Test
  public void f() {
	  
	  
	  //HashMap map=new HashMap()s;
	  
	  JSONObject json=new JSONObject();
	   //https://reqres.in/api/userss
	   json.put("c","ssgdggs");
	   json.put("job","200");  
	   
	  RequestSpecification res=RestAssured.given();
	  
	     res.contentType("Application/json");
	   
	
	     Response rev=res.post("https://reqres.in/api/users");
	         String s=rev.jsonPath().toString();
	        System.out.println(s);
	        	
	       
	     
	      int  statusCode=rev.statusCode();
	      System.out.println(rev.statusCode());
System.out.println(rev.getTime()); 
System.out.println(rev.getBody().asString());
Assert.assertEquals(statusCode,201);

  }

}
