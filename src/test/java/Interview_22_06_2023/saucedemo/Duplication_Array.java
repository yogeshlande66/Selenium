package Interview_22_06_2023.saucedemo;

public class Duplication_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,30,40,50,10}; 
	int sum=a[0];
	    for(int i=0;i<a.length;i++)
	    {
	    	for(int j=0;j<a.length;j++)
	    	{
	    		if(a[i]==a[j])
	    		{
	    		sum=a[i];   
	    		}
	    		
	    		
	    		
	    	}
	    }
	   
	    System.out.print(sum);

	    
	}

}
