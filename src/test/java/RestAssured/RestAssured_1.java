package RestAssured;

import static org.testng.Assert.assertEquals;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.opentelemetry.sdk.logs.data.Body;
import io.restassured.RestAssured;
	
public class RestAssured_1 {
  @Test
  public void f() {
	 
	/*Response res=RestAssured.get("https://gorest.co.in/public/v2/users");
	int i=res.getStatusCode();
	System.out.println(i);
	Assert.assertEquals(i, 200);	
	String s=res.getBody().asString();
	//int t=(int) res.getTime();
	System.out.print(s);
	System.out.println(""+res.getTime());*/
	
	 /// System.out.println();
	  
	 
	 
	  
	
  }
  @Test
  public void show()
  {
   // Response re= RestAssured.get("https://gorest.co.in/public/v2/users");
	Response re=RestAssured.get("https://reqres.in/api/users?page=2");
	
    System.out.println("Api status time"+re.getTime());
    int n=re.getStatusCode();
    Assert.assertEquals(n, 200);
    String s=re.getBody().asString();
    
 /// System.out.println("The request body of the "+s);
 
}
  
}
