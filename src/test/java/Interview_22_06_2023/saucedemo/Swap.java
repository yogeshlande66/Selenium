package Interview_22_06_2023.saucedemo;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* int n=20;
   int sum=0;
  for(int i=0;i<=n;i++)
  {
	  sum=sum+i;
	  
  }
  System.out.println(sum);
	 
	 
	/* a=a+b;
	 b=a-b;
	 a=a-b;
	 System.out.println(a+"\n"+b);
	 
*/
		 String  s="yogesh@jj$";
		 s=s.replaceAll("[^a-zA-Z0-9]","");	
		 int l=s.length();
	//	 System.out.print(s);   
		 String s1=s;
		 System.out.println(s1.length());
	     String rev="";
		 for(int i=8-1;i>=0;i--)
		 {
			 
		  rev=rev+s1.charAt(i);
		 }
		 System.out.println(rev);
	 
	} 	

}