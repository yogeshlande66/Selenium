package JAVA_Program;

import java.util.Scanner;

public class If_else_if {
	
	public static void main(String args[])
	{
		int marksObtain;
		int passingMarks=40;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marksobtain");
		marksObtain=sc.nextInt();
		if(marksObtain>90 && marksObtain<100)
		{
			System.out.println("Sucessfully passed with A grade");
		}
		else if(marksObtain>65 && marksObtain<90)
		{
			System.out.println("Sucessfully passed with A+ grade");
			
		}
		else if(marksObtain<40)
		{
			System.out.println("The candidate is failed");
		}
		else
		{
			System.out.println("Obtain marks should not be >100");

			
		}
		
		
		
	}

}
