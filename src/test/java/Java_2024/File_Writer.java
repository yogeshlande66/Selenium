package Java_2024;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class File_Writer {

	public static void main(String[] args) throws IOException {
		FileOutputStream file=new FileOutputStream("F:\\lande.txt");
	    String s="fhdddjdgjd";
	    byte b[]=s.getBytes();
	     file.write(b);
	     file.close();
    	 System.out.println
    	 (b);
	    
		    FileInputStream file1=new FileInputStream("F:\\lande.txt");
		    int i;
		    while((i=file1.read())!=-1)
		    {
		    	System.out.print((char)i);
		    }
		    file1.close();
		}   

	}   