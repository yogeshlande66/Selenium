package Java_2024;

public class Duplicatestring {

	public static void main(String args[])
	{
		/* String s="iiippplllkkk";
		// String rev="";
		 char ch[]=s.toCharArray();
		 int count=0;
		 // StringBuffer s1=new StringBuffer(s);
		  //s1.reverse();
		//  System.out.print(s1.reverse());
		  
		  // Using for Loop
		/* for(int i=ch.length-1;i>0;i--)
		 {
			 rev=rev+ch[i];
		 }	
		 System.out.println(rev);*/
/*		 for(int i=0;i<ch.length;i++)
		 {
			 for(int j=i+1;j<ch.length;j++)
			 {
				 if(ch[i]==ch[j])
				 {
					 System.out.println(":"+ch[j]);
					count++;
				 }
				
				 
			 }
		 }
		 System.out.println(count);  */
		/*
		 for(int i=1;i<=4;i++)
	      {
	        for(int j=3;j>=i;j--)
	        {
	           System.out.print(" ");
	        }
	        for(int k=1;k<=i;k--)
	        {
	       
	          System.out.print("*");
	        }
	     
	       System.out.println();
	     } 
		 
		 */
	      



    int a[]={1,4,5,6};
   // int max=a[0];
    int temp=0;
    for(int i=0;i<a.length;i++)
    {
        for(int j=i+1;j<a.length;j++)
        {
        if(a[i]>a[j])
        {
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            
            //max=a[i];
        }
    }
        System.out.println(""+a[i]);
 }
    System.out.println(""+a[1
                            ]);


    
    }
}
