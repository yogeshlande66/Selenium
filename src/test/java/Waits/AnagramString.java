package Waits;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		// TODO Auto-generated method stubs
		 String s="Silent";
		 String s1="listen";
		 char[] ch=s.toCharArray();
		 char[] ch1=s.toCharArray();
		 Arrays.sort(ch);
		 Arrays.sort(ch1);
		 if(Arrays.equals(ch, ch1))
		 {
			 System.err.println("The given string is the anagram");
		 }
		 else
		 {
			 System.err.println("The gievn String is not anagaram");
		 }

		 
		 
		 

	}

}
