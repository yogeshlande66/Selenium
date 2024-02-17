package Collection;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Text_File {
	public static void main(String args[]) throws IOException
	{
		String File="F:\\yogesh.txt";
		// Assume the default encodings
		FileWriter file1=new FileWriter(File);
		// Always wrap FleWriter in BufferedWriter
		BufferedWriter buf=new BufferedWriter(file1);
		
		//Write something into file
		buf.write("Hello");
		buf.write("There is nothing the class");
		buf.close();
		System.out.println(buf);
	
		
	}

}
