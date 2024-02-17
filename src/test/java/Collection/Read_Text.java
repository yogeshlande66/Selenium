package Collection;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read_Text {
	public  static void main(String args[]) throws IOException
	{
	String  line=null;
		FileReader file=new FileReader("F:\\yogesh.txt"); //
		//FileReader always wrap with Buffered Reader
		BufferedReader buf=new  BufferedReader(file); //Read The file
		while((line=buf.readLine())!=null) // To Check the file empty or not
		{
			System.out.println(buf);
		
		}
	}

}
