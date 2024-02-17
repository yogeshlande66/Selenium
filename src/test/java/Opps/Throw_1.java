package Opps;

import java.util.Scanner;

class Throw_1
{
	
  
     public static void main(String args[])
     {
    	 int age;
    		// creates an object of Scanner
    	    Scanner input = new Scanner(System.in);
    	    System.out.println("Enter the Customer age");
    	    age=input.nextInt();
    	    try
    	    {
    	    	if(age<18)
    	    	{
    	    		throw new Exception("Age should be 18");
    	    	}
    	    	
    	    }
    	    catch(Exception e)
    	    {
    	    	System.out.println(e);
    	    	
    	    }
    	 

    	 
     }
     
}


