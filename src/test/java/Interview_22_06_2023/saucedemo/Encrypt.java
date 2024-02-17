package Interview_22_06_2023.saucedemo;

import java.util.Scanner;

import io.netty.handler.codec.base64.Base64;

public class Encrypt {
	 public static void main(String args[])
	 
	 { 
		 int a,b,c;
		 
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter the three no's");
		  a=sc.nextInt();

		  b=sc.nextInt();
		  c=sc.nextInt();
		  if(a>b && a>c)
		  {
			  System.out.println("THE A is grater");
		  }
		  else if(b>a && b>c)
		  {
			  System.out.print("The b is grater");
		  }
		
		
	 }
	 

}
