package Java_2024;

public class ArrayMaxNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,40,50};
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println(max);
	}

}