package Collection;

public class String_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    String s="Yogesh";
		     String rev="";
		      
		     for(int i=s.length()-1;i>=0;i--)
		     {
		    	 rev=rev+s.charAt(i);
		     }
		     
		     
		     System.out.println(rev);
		     
		      char ch[]=s.toCharArray();
		      for(int i=0;i<ch.length;i++)
		      {
		    	   System.out.println(ch[i]);
		      }
		      
		    	   byte[] b=s.getBytes();
		    	   for(int i1=0;i1<=b.length;i1++)
		    	   {
			    	   System.out.println(b[i1]);

		    	   }
       }
		    //  System.out.printl(x);
		      
		      	


} 
