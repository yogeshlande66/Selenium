package TestNg;

import org.testng.annotations.Test;

public class Priority_1 {


		@Test
		public void get()
		{
			System.out.print("This is the first test case");
		}
		@Test(priority=1)
		public void show()
		{
			
			System.out.println("This is the 1st test case");
			
		}
		
		@Test(priority=0)
		public void show1()
		{
			System.out.println("This is the 0 priority  test case");

			
			
		}
		@Test(dependsOnMethods="show")
		public void show2()
		{
			System.out.println("Hello");
			
			
		}
		
				
			}
			



