package Opps;

class Over
{
	/*public int add(int a,int b)
	{
		return a+b;
		
	}*/
	public void get()
	{
		System.out.println("This is parent class");
	}
}
public class OverRiding extends Over {
	/* public int add(int a,int b)
	 {
		 return a+b;
		
	 }*/
	public void get()
	{
		System.out.println("This is child class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Over a=new OverRiding(); // Executing the child class method always
	//	System.out.println(a.add(10,20));
		 a.get();
		 }

}
