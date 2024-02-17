package TestNg;

public class Palindrome {
	public static void main(String args[])
	{
	/*	StringBuilder str=new StringBuilder("12321");
		
		StringBuilder str2=new StringBuilder("");
		
		if(str2.equals(str))
		{
			System.out.println("given string is palindrome");
		}
		else
		{
		System.out.println("given string is not  palindrome");
		}
		}*/
		int n=12321;
		int r;
		int temp;
		int sum=0;
		temp=n;
	
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
			
		}
		if(temp==sum)
		{
			System.out.println("No are palindrome");
			
		}
		else
		{
			System.out.println("No are not palindrome");
			
		}
		
		
			
	}
		
	}


