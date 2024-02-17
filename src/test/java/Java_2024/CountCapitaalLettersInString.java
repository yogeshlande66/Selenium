package Java_2024;

public class CountCapitaalLettersInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 String s="TestPOI";
	 int count=0;
	 for(int i=0;i<s.length();i++)
	 {
		 if(s.charAt(i)>='A' && s.charAt(i)<='Z')
		 {
			 count++;
			 
		 }
	 }
	  System.out.println(count);

	}

}
