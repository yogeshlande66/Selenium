package JAVA_Program;

public class Cons {
	
	String name;
	String address;
	String Area;
 static String city="banglore";
	//	static city="banglore";
	Cons(String name,String address,String Area)
	{
	 this.name=name;
	 this.address=address;
	 this.Area=Area;
	}
    void get()
    {
    	System.out.println(name+"\n"+address+"\n"+Area);
    }
    public static void show()
    {
    	int a=10;
    	System.out.println("cadfsfas");
    	String name="YOGESH";
     }
    static
    {
      System.out.println("This is the largest");
 	   
    }
 
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cons c=new Cons("yoges","fdfsf","fdssgsg");
		c.get();
		System.out.println(Cons.city);
		Cons.show();
		
		

	}

}
