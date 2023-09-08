package RestAssured;

import java.util.HashMap;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Delete {
  @Test
  public void f() {
	  
	  // Response res=RestAssured.delete("https://reqres.in/api/users/2");
	 /* int statusCodes= res.statusCode();
	  String s=res.getBody().asString();
	  
	  System.out.print(statusCodes+""+s);*/
	    RequestSpecification rs=RestAssured.given();
	    rs.contentType("Application/json");
	    

	 JSONObject json=new JSONObject();	
	 
	  json.put("name","gggdgdfsggsg");
	  json.put("job","zion resident");
	   rs.body(json.toJSONString());
	
	 Response res=rs.get("https://reqres.in/api/users/2");
	int i=res.statusCode();
	 String s=res.body().asString();
	   
	 System.out.print(s+""+i);
	 
	 
	
	  

	  
	
	
	
	  
	 
	  
	  
	  
	  
	  
	  
	  
	 
	 
	  
	  
	  
	  
	   
	    
	    
	   
	   
	   
	   
  }
}
