package Waits;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonReader_1 {
	public static void main(String args[]) throws IOException, ParseException
	{
		//Create The object of the json
		JSONParser par=new JSONParser();
		
		FileReader read=new FileReader("C:\\Users\\ADMIN\\eclipse-workspace\\Selenium\\src\\test\\resources\\Login.json");
	    Object	obj= par.parse(read);
	    //Converting the java object to json
	    JSONObject jsonobj=(JSONObject)obj;
	    String name1=(String)jsonobj.get("name");
	    String pass1=(String)jsonobj.get("pass");
	    JSONArray arr=(JSONArray)jsonobj.get("address");
	    for(int i=0;i<arr.size();i++)
	    {
	    	JSONObject	address=(JSONObject)arr.get(i);
	    	String firstname=(String )address.get("FirstName");
	    	System.out.println(firstname);
	    	System.out.println(address.get("LastName"));

	    	System.out.println(address.get("City"));
		    System.out.println(address.get("Per"));	     
		    }
	 
	}

}
