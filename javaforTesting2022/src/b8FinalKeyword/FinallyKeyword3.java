package b8FinalKeyword;

public class FinallyKeyword3 {

	public static void main(String[] args) {


	//Finally keyword always use with try and catch block	
	//finally block will be execute after try and catch block
	//Finally block always execute
		
		
		
		division();
	
		

	}
	
	public static void division()
	{
		int i =10;
		
		try {
			
			System.out.println("inside try block");
			int l=i/0;                                            //exception come at this place
		    }catch(ArithmeticException e) {
		    	System.out.println("inside catch block");
		    	System.out.println("divide by zero error");
		    }
		finally {
			
			System.out.println("execute this code even after any exception");
		}
		
	}

}


