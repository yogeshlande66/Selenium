	package JAVA_Program;
	
	public class String_reverse {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	
		String s="hello";
		 //   int n=s.length();
		    String rev="";
		  //  System.out.println(n);
		    // My length is 5 ,Hence I started from 5
		    try
		    {
		    for(int i=s.length()-1;i>=0;i--)
		    {
		    	rev=rev+s.charAt(i);
		    	
		    }
		    }
		    catch(Exception e)
		    {
		    	System.out.println(e);
		    }
		    System.out.println(rev);  
			 /*StringBuffer br=new StringBuffer("Hello");
			 br.reverse();
			 System.out.println(br);*/
		  
		}
	}
