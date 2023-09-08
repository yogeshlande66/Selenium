package JAVA_Program;

public class Getter_Method {
	private int id;
	private String name;
	
	public void setId(int id)
	{
		this.id=id;
	}
public int getId() 
{
	
	 return id;
}
 
 public static void main(String args[])
 {
	 Getter_Method m=new  Getter_Method();
	 m.setId(45);
     System.out.println(m.getId());
	
	 
	 
 }
 
}
