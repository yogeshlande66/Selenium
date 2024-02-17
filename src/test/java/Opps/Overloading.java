package Opps;

public class Overloading {
	
 public int  add(int a,int b)
 {
	 return a+b;
 }
 public float sub(int a,int c)
 {
	 return a-c;
}
 public int Mul(int a,int b,int d)
 {
	 return d=a*b;
	 
 }
 public static void main(String[] args) 
 {
		// TODO Auto-generated method stub
	Overloading d=new Overloading();
	System.out.println("This is value of add:"+d.add(10, 20));
	System.out.println("This is value of sub:"+d.sub(10, 20));
	System.out.println("This is value of add:"+d.Mul(10, 10, 30));
		
		
		

	}

}
