package c4ExceptionInJava;

public class ExceptionInJava2 {

	public static void main(String[] args) {
		
		
		float c=0;
		int a[]= {2,3,0};         //array
		
		try
		{
			c=(float)a[0]/a[3];                //to convert int to float (typecast)
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(Exception e)                  //(Exception)super class of catch block
		{
			System.out.println(e);
		}
		
		System.out.println("Value of C :"+c);
		
		c=a[0]+a[1];
		
		System.out.println("Addition :"+c);
	}

}