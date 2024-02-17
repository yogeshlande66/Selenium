import java.util.*;
public class  Test
{
 public int Add(int a,int b)
 {
	 int sum=a+b;
	  return sum;
 }
 	
	public static void main(String args[])
	{
		int num1=10;
		int num2=20;
		Test t=new Test();
		 int result=t.Add(num1, num2);
		  
		 System.out.println("Result of the Add:"+result);	
		 System.out.println("Result of the Add:"+t.Add(10, 3000));	
		 System.out.println("Result of the Add:"+t.Add(30, 1));	
		 System.out.println("Result of the Add:"+t.Add(30, 3));	


		
	}
}
