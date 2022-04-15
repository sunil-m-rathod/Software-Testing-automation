package c4ExceptionInJava;

public class ThrowKeywordInJava2 {

	public static void main(String[] args){

// Throw keyword intensely throwing exception on basic of own condition
//When exception not define by system need to create class and create constructor
		int n=-1;
		
		if(n<0)
		{
			try
			{
				throw new NegativeNumberException();	//user defined exception,we need to create class 
			}
			catch(NegativeNumberException e)
			{
				System.out.println(e);
			}
		}
		
		System.out.println("Value of n:"+n);
	}

}

class NegativeNumberException extends Exception    //create class and inheritance need to create for user defined exception
{
	public NegativeNumberException()               // constructor created 
	{
		System.out.println("Negative Number Exception");
	}
}
