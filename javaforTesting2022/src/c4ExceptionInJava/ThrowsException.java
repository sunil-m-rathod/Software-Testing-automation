package c4ExceptionInJava;

public class ThrowsException {





	public class Test {

		public static void main(String[] args) throws ArithmeticException{   //throws keyword mostly used for Checked exception//throws not handle exception
			
			
			float c=0;
			int a[]= {2,3,0};
			
			c=a[0]/a[2];
			
			System.out.println("Value of C :"+c);
			
			c=a[0]+a[1];
			
			System.out.println("Addition :"+c);
		}

	}
}
