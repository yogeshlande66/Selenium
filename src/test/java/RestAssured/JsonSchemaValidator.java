package RestAssured;

import static org.testng.Assert.assertEquals;

import java.io.File;

import org.hamcrest.Matcher;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.module.jsv.JsonSchemaValidationException;

import io.restassured.*;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class JsonSchemaValidator {
  @Test
  public void f() {
	  
	  
/*
	Response res=RestAssured.get("https://reqres.in/api/users?page=2");
     int u=res.statusCode();
	System.out.println("The status code shouold be 200");
	   ((Assert) res).assertEquals(u,200); */
      //obtain response
      RestAssured.given()
      .when()
      .get("https://reqres.in/api/users?page=2")
   //verify JSON Schemaz
      .then().assertThat()
      .body(io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema(new File("C:\\Users\\ADMIN\\eclipse-workspace\\Selenium\\src\\test\\java\\RestAssured\\SCHEMA.JSON")))
      .statusCode(200);
    //  Assert.assertEquals(, null)
      
      
     
      
     // .body(JsonSchemaValidator.
      //matchesJsonSchema(new File("/Users/src/Parameterize/schema.json")); 
	  
      
	 
	 
	 
	 
	 
	   
	 
  }


}

