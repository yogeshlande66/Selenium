package Java_2024;

public class MethodOverriding {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   B b=new B();
		b.get();
		b.get();

	}
}
	class demo
	{
	
	void get()
	{
		System.out.println("Yogesh");
	}
}
	
class B extends demo
{
	 void get()
	 {
		 System.out.println("hi");
	 }
}
	


