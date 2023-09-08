package JAVA_Program;

import java.util.Scanner;

public class Odd_Even {
	public static void main(String args[])
	{
		int a;
		System.out.println("Enter the no");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		if(a%2==0) // % is return the remainder of the two no after division of two no's
		{
			System.out.println("The no is even");
			
		}
		else
		{
			System.out.println("The no's is odd");
		}
	   
		
	}

}
