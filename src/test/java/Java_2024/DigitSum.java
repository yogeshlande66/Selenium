package Java_2024;

public class DigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=158;
		int sum=0;
		int rev;
		while(number>0)
		{
			rev=number%10;
			//sum=sum+rev;
			number=number/10;
		}		
		System.out.println(sum);
	}

}
