package Java_2024;

public class SubSequenceString_1 {
	public  static void main(String args[])
	{
		
	 String s="abcd";
	 for(int i=0;i<s.length();i++)
	 {
		 for(int j=i;j<s.length();j++)
		 {
			 System.out.print(" "+s.substring(i,j+1));
			
		 }
		 System.out.println(" ");
	 }
//	 System.out.print(" "+s.substring(1,2));

	}
}
