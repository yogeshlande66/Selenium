package JAVA_Program;

interface A
{
	void get();
	void  show();
	
	
}
class B implements A
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
		 B b=new B();
		 
		 b.get();
		 b.show();
		 
	 }
	
}
