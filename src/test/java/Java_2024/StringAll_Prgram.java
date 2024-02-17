package Java_2024;

public class StringAll_Prgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="lande";
		String s1="lande";
		System.out.println(s==s1);
		String s3=new String("Yogesh");
		System.out.println(s==s3);
	    System.out.println(s.indexOf(s.charAt(1), 4));
	    System.out.println(s.substring(2, 4));
	    String s4="Yogesh 02/11/2022 9850";
	    String[] ch=s4.split("\\s");
	    for(String sp:ch)
	    {
	    System.out.println(sp);
	    }
	     String s5="y@gesh#$$";
	     String s6="";
	     s6=s5.replaceAll("[^a-zA-Z]","");
	     System.out.println(s6);
	}
	
}
