package Interview_22_06_2023.saucedemo;

public class Missing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int sum=0;
	int  sum1=0;
	  int a[]= {1,2,4,5};
	  for(int i=0;i<a.length;i++)
	  {
		  sum=sum+a[i];
		  
	  }
	  for(int j=1;j<=5;j++) {
		  sum1=sum1+j;
		  
	  }
	   int repl=sum1-sum;
	   System.out.println(repl);
	   
	}

}
