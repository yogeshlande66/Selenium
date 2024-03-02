package Waits;

public class StrintToInt 
{
	static String  get(String s)
	{
	    Integer i=Integer.parseInt(s);
		return s;
	}
	public static void main(String[] args) 
	{
		String s="357";
		System.out.println(get(s));
	}

}