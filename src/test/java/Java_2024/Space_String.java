package Java_2024;

public class Space_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello world";
		for(String part:s.split(" "))
		{
			System.out.print(new StringBuilder(part).reverse().toString());
			System.out.print(" ");
		}
	}
}
