package Java_2024;

import java.util.Arrays;

public class ArraySortig {

	public static void main(String[] args) 
	{	    
		 int a[]= {10,30,40,50};
		  Arrays.sort(a);
		  for(int i=0;i<a.length;i++)
		  {
			  System.out.println(a[i]);
			  
		  }	  
		  System.out.println("This Decending the array");
		 for(int j=a.length-1;j>=0;j--)
		 {
			 System.out.println(a[j]);
		 }
	}

}
