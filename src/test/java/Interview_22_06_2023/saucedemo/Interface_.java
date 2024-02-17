package Interview_22_06_2023.saucedemo;


interface A
{
  void get();
  void show();
}
public class Interface_  implements A {
	 public void get()
	 {
		  System.out.println("This si the get method");
	 
	 }
@Override
public void show() {
	 System.out.print("This is the show method");
	// TODO Auto-generated method stub
}
public static void main(String args[])
{
	Interface_  inter=new Interface_();
	inter.show();
	inter.get();
	
}

	
}
	

