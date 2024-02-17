package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class List {
 public static void main(String args[])
 {
	 ArrayList<Integer> list=new ArrayList();
	 list.add(10);
	 list.add(20);
	 list.add(65);
 /*  Iterator itr=list.iterator();
    while(itr.hasNext())
    {
    	System.out.println(itr.next());
    }*/
	 for(int a:list)
	 {
		 System.out.println(a);
	 }
}
 
}
