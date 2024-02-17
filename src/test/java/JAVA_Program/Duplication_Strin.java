package JAVA_Program;

public class Duplication_Strin {

	public static void maiin(String args[])
	{

		// TODO Auto-generated constructor stub
		String s="mahadev";
		char c[]=s.toCharArray();
		for(int i=0;i<s.length();i++)

	{
			for(int j=1;j<i;j++)
			{
				if(c[i]==c[j])
				{
					System.out.println(c[j]);
					break;
				}
			}
				
			
	}
	}
}


