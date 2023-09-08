package JAVA_Program;

interface BEED
{
void get();
void show();

}

 class Bank implements BEED  {
	
	 public void get() {
		 System.out.println("This is the get method");
			// TODO Auto-generated method stub
			
		}

		public void show() {
			System.out.println("This is the show method");
			// TODO Auto-generated method stub
			
		}

	public static void main(String[] args) {
	
         Bank  b=new Bank();
		b.get();
		b.show();

	}

	

}
