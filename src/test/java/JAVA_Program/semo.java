package JAVA_Program;

public abstract class semo {
	abstract void get();
}
class Abs extends semo 
{
	void get() {
		System.out.println("this is abstract method");
		// TODO Auto-generated method stu
	}
	public static void main(String args[])
	{
		Abs s=new Abs();
		s.get();
	}
	
}
