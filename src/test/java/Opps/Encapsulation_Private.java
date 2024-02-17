package Opps;

public class Encapsulation_Private {
	 private String name,pass;
	   private int age;
	   public String getName()
	   {
		   return name;
	   }
	    public void setName(String name)
	    {
	    	this.name=name;
	    	
	    }
	    public String  getPass()
	    {
	    	return pass;
	    }
	    public void setPass(String pass)
	    {
	    	this.pass=pass;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation_Private e=new Encapsulation_Private();
		e.setName("yogesh");
		e.setPass("yogesh");
	System.out.println(e.getName()+"\n"+e.getPass());
	
	}

}
