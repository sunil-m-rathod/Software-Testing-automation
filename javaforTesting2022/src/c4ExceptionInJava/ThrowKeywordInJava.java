package c4ExceptionInJava;

public class ThrowKeywordInJava {

	public static void main(String[] args){
		
		
		int n=-1;
		
		if(n<0)
		{
			try
			{
				throw new ArithmeticException();   	//system defined exception
			}
			catch(ArithmeticException e)
			{
				System.out.println(e);
			}
		}
		
		System.out.println("Value of n:"+n);
	}

}