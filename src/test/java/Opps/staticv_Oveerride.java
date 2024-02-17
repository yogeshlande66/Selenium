package Opps;


class Private_1
{
	private void get()
	{
		System.out.println("This is my  parent class");
		
	}
	
	
}
public class staticv_Oveerride extends Private_1 {
	 private void get() {
		 System.out.println("This is my child class");
		 
	 }
	
	
	 public static void main(String args[])
	 {
		 staticv_Oveerride e=new staticv_Oveerride();
		 e.get();
		 
	 }

}
