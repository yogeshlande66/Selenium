package Interview_22_06_2023;

public class Array_Number_present {
	private static void check(int[] arr,int CheckVal)
	{
	  boolean test=false;
	  for(int element:arr)
	  {
		  if(element==CheckVal)
		  {
			   test =true;
			   break;
			   
		  }
	  } 	
	 //Print the result
	 System.out.println("The array element is present"+CheckVal+""+test);
	  
		
	}
 public static void main(String args[])
 {
	int[] arr= {10,2,20,14,25,5,6,7,8,9,4,1};
	int  CheckVal=1;
  check(arr,CheckVal);
	
	 
 }


}
