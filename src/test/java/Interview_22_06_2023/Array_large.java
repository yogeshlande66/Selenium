package Interview_22_06_2023;

public class Array_large {
	
		static  int a[]= {10,20,30};
		 //method to find max in the array
		 public static  int largest()
		  {
			
			   //initialize the max element
			   int max=a[0];
			   for(int i=1;i<a.length;i++)
			   {
				   if(a[i]<max)
				   {
					   max=a[i];
				   }   
				   
			   }
			   
			   return max;
			   
		  }
		  public static void main(String args[])
				  {
			   System.out.println("The largest element of the array"+largest());
			  
				  }
		 

}
