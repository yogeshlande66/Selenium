package Opps;

public class Encapsulation_Con {
	 private int age;
	  public int getAge()
	  {
		  return age;
	  }
	  public int setAge(int age)
	  {
		return age;
		  
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation_Con en=new Encapsulation_Con();
		en.getAge();
		System.out.println("This is the age of the student:"+en.setAge(20));
		

	}

}
