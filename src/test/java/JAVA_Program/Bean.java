package JAVA_Program;

public class Bean {
	 private int id;
	  private String age;
	    public void setId(int id)
	    {
	     this.id=id;
	     
	    }
	     public int getId()
	     {
	    	  return id;
	     }
	     public  void  setAge(String age)
	     {
	    	 this.age=age;
	    	 
	     }
	      public String  getAge()
	      {
			return age;
	    	  
	      }
	      public static void main(String args[])
	      {
	    	  Bean b=new Bean();
	  		b.setAge("Thirteen");
	  		b.setId(200);
	  		System.out.println(b.getAge());
	  		System.out.println(b.getId());

	    	  
	      }
	  

}
