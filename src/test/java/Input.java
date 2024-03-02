import java.io.BufferedReader;
		import java.io.IOException;
		import java.io.InputStreamReader;


public class Input {

	public static void main(String[] args) {

		   
		        // Enter data using BufferReader
		        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		            
		        System.out.println("Enter the name");
		        
		 
		        // Reading data using readLine
				try 
				{
				String	name = reader.readLine();
				int i=reader.read();
				double d=reader.read();
				float f=reader.read();
				System.out.println(name);
				System.out.println(i);
				System.out.println(d);
				System.out.println(f);
				} 
				catch (IOException e) 
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		        
		    }
		}


