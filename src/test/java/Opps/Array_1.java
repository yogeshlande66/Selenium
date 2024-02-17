package Opps;

import java.util.Scanner;

public class Array_1 {
 public static void main(String args[])
 {
	 int a[]=new int[4];
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the array value's");
	 for(int i=0;i<a.length;i++)
	 {
		 a[i]=sc.nextInt();
	 }
	int min=a[0];
	 System.out.println("Output of the  array:");
	 for(int i=1;i<a.length;i++)
	 {
		 if(a[i]<min)
		 {
			 min=a[i];
		 }
	 }
	 System.out.println(min);
 }
}
