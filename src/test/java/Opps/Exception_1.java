package Opps;

public class Exception_1 {

	public static void main(String[] args) {
	
		try
		{
			//int a=100/0;
			String s=null;
		//System.out.println(a);
	System.out.println(s.length());
			
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}
		finally {  
			System.out.println("finally block is always executed");  //Should be declare after catch block 
			}    
		System.out.println("rest of the code");
		
	}

}
