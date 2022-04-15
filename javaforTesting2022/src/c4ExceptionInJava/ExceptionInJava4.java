package c4ExceptionInJava;

//Final: it is keyword.it will not allow to change value
//Finalize: finalize is method use for garbage collection,to collect unreferenced object or which are not use and remove by using finalize method.JVM do automatically
//Finally:is a block.it will execute compulsory.mostly used for closing database connection and closing files.not used for handling exception  





//finally block

public class ExceptionInJava4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float c=0;
		int a[]= {2,3,0};
		
		try					//outer try block
		{
			
			try				//inner try block
			{
				c=a[0]/a[1];
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e);
			}
			finally
			{
				System.out.println("I am here inside inner try block");      //inner Finally block
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		finally                                     //Finally block
		{
			System.out.println("I am here");
		}
		
		System.out.println("Value of C :"+c);
		
		c=a[0]+a[1];
		
		System.out.println("Addition :"+c);
	}

}