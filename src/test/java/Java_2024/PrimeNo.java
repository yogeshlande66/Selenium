package Java_2024;

import java.util.Scanner;
public class PrimeNo {

	public static void main(String[] args) {
		
		// Online Java Compiler
		// Use this editor to write, compile and run your Java code online
	
		        Scanner sc=new Scanner(System.in);
		      //  int n1,n2,j;
		        int j;
		         System.out.println("Enter the no");
		        // n1=sc.nextInt();
		        //  n2=sc.nextInt();
		          for(int i=0;i<=100;i++)
		          {
		              for(j=2;j<=i;j++)
		              {
		                  if(i%j==0)
		                  {
		                      break;
		                  }
		              }
		             if(i==j)
	                  {
		                   System.out.println(""+j);

	                  }
		            
		   }  
	}

}
