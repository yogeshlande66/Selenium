package Java_2024;

public class ReverString1 {
	public static void main(String main[])
	{
		
  String s="YogeshLande";
  String rev="";
  for(int i=s.length()-1;i>=0;i--)
  {
	  rev=rev+s.charAt(i);
  }
  System.out.println(rev);
  
  
	}

}
