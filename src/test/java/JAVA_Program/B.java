package JAVA_Program;



interface A1
{
	void get();
	void  show();
	
	
}
class B1 implements A
{

	public void get() {
		
	 System.out.println("This is the interfac get method");
		
	}

	public void show() {
		
	 System.out.println("This is the interfac show  method");
		// TODO Auto-generated method stub
		
	}
	 public static void main(String args[])
	 {
		 B1 b=new B1();
		 
		 b.get();
		 b.show();
		 
	 }
	
}
