package c4ExceptionInJava;


      //nested try block
public class ExceptionInJava3 {

	public static void main(String[] args) {
	
		
		float c=0;
		int a[]= {2,3,0};
		
		try					  //outer try block
		{                    //if there is exception in outer try block it not goes in inner try or catch block.the control goes to outer catch block  
			a[4]=45;
		try			                  //inner try block
			{
				c=a[0]/a[3];         //if there is exception in inner try block,the control first goes to inner catch block
					                  //to check weather we have required catch block or not
			}
			catch(ArithmeticException e)
			{
				System.out.println(e);
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		
		
		catch(ArithmeticException e)    //multi catch block 
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		System.out.println("Value of C :"+c);
		
		c=a[0]+a[1];
		
		System.out.println("Addition :"+c);
	}

}