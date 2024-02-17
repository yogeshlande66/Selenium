package Collection;

import java.util.ArrayList;
import java.util.Collection;

public class Iterator {

	public Iterator() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   ArrayList<String> arr=new ArrayList<>();
	   arr.add("Yogesh");
	   
	   arr.add("lande");
	   
	   arr.add("test");
		
	   arr.add("vest");
	   arr.add("lest");
	   java.util.Iterator<String> it=arr.iterator();
	   while(it.hasNext())
	   {
		   System.out.println(it.next());
	   }
	   
	   for(String s:arr)
	   {
		   System.out.print(arr);
	   }
	  
		

	}

}
