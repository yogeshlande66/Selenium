package JAVA_Program;

public class Factorial {
	
static int fact(int n)
{
	if(n==1)
	{
		return 1;
	
	}
	else
	{
		 return(n*fact(n-1));
		 
	}
	
	
}
public static void main(String args[])
{
	Factorial f=new Factorial();
	System.out.println("Print the fact no:"+f.fact(5));
	
	
}
	

}
