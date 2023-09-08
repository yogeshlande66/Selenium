package RestAssured;

import static org.testng.Assert.assertEquals;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssured_post {
  @Test
  public void f() { //https://reqres.in/api/users
	/* RequestSpecification rev=RestAssured.given();
	//rev.header("content-type","application/json");
			
	JSONObject json=new JSONObject();
     json.put("name","yogesh");
     json.put("job", "leader");
     rev.body(json.toJSONString()); //  Converting the jsonto String
     Response res=rev.post("https://reqres.in/api/users");   ///Response is the interfaced used to store the response of the method
     int i=res.getStatusCode();
     String s=res.body().asString();
     System.out.println(s);
     
     System.out.print(i);
	  //Get Method
	
	 /*Response res=RestAssured.get("https://reqres.in/api/users/2");
	   int  code=res.getStatusCode();
	   String  s= res.getBody().asString();
	 //int time=(int)res.getTime();
	 
	System.out.println("The code shouold be:"+code);
	System.out.println("The Reponse Data:"+s);
//	System.out.println("The time of response:"+time);    */
	  
	  RestAssured.given().
	  auth().preemptive().
	  basic("Developer5@gmail.com", "123456").
	  when().
	  get("http://restapi.adequateshop.com/api/authaccount/registration").
	  getStatusCode();
	 
  }
}
