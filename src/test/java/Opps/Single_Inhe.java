package Opps;


class A 
{
	int a=20;
	 public void a()
	 {
		  System.out.println("This is my A class"+a);
	 }
	 
}
class B extends A
{
	public void b()
	{
	  System.out.println("This is my B class");
}
}
class C extends B
{
	public void c()
	{
		//sa=30;
	  System.out.println("This is my c class");
}
}

public class Single_Inhe {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new C(); 
		b.a();
		b.b();
	//	b.c();
		// Parent class hold the refrence for the child and parent 
		//class also but is there is any variable has same value in the parnt and child 
      	//then refrence goes to parent class(In generel refrence is also goes to parent class)
				
		

	}

}
