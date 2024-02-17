package Collection;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashSet;
import java.util.Set;

public class Set_1 {

	
	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
		Set<Character> se=new HashSet<>();
	    for(char c='a';c<='z';c++ )
	    {
	    	se.add(c);
	    	
	    }
	    System.out.print("[");
	    java.util.Iterator<Character> itr=se.iterator();
	    while(itr.hasNext())
	    {
	    	System.out.print(itr.next()+",");
	    }
	    System.out.print("]");
	    System.out.println();
	    System.out.println(InetAddress.getLocalHost());
	}
	

}
