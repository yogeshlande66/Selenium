package Opps;


interface Interface_1
{
	 void get();
	 void  show();
}
public class Inheritence implements Interface_1 {
	public void get() {
		System.out.println("This is my get method");
	}
	public void show() {
		System.out.println("This is my show  method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inheritence in=new Inheritence();
		in.get();
		in.show(); //Multiple inheritence achive by using interface 
	

	}


}
