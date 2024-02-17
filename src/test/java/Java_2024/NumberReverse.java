package Java_2024;

public class NumberReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int number=456;
		 int rev=0;
		  while(number!=0)
		  {
			  int rem=number%10;
			  rev=rev*10+rem;
			  number=number/10;
		  }
		  System.out.println(rev);
	}

}
