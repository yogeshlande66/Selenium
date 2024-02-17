package Collection;

public class Array_dup {

	public static void main(String[] args) {
	 int a[]= {10,20,30,50,60,10,90,100};
	 /* for(int i=0;i<a.length;i++)
	  {
		  for(int j=i+1;j<a.length;j++)
		  {
			  if(a[i]==a[j])
			  {
				 // System.out.println("Duplicates element"+a[i]);
				  System.out.println("Duplicates element"+a[i]);

			  }
	  }
			
		// TODO Auto-generated method stub

	}
*/
	  int small=a[0];
	  for(int i=0;i<a.length;i++)
	  {
		  if(a[i]>small)
		  {
			  small=a[i];
			
		  }
	  }
	  System.out.print(small);
		   

	}
	
}
