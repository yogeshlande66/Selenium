package Waits;

import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="yogesh lande";
		char[] ch=s.toCharArray();
		String rev="";
		for(int i=ch.length-1;i>=0;i--)
		{
			rev=rev+ch[i];
		}
		
	   System.out.println(""+rev);
		
		

	}

}
