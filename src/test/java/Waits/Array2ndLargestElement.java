package Waits;

import java.util.Arrays;

public class Array2ndLargestElement {


		
		// Online Java Compiler
		// Use this editor to write, compile and run your Java code online
		
		    static int get(int arr[])
		    {
		        Arrays.sort(arr);
		        int n=arr.length;
		        
		     return arr[n-2];
		       
		    }
		    public static void main(String[] args) 
		    {
		        int[] arr={6,5,3,10,2,0};
		       System.out.println(get(arr));		      
		    }
	
	}
