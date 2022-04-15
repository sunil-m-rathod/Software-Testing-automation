package a2Basic;

public class ObjectCreate {

	public static void main(String[] args) {
		  
		
	 //whatever method you want to call, check in which class it belongs to now create object of class and call methd ;
		
		ObjectCreate A = new ObjectCreate();   // To call Non static method need to Create OBJECT OF CLASS.
	    A.Sam();                             // TO CALL Sam method 
	                                         
		A.Ram();                             // To call Ram method
		
		sunil();                      //for static method no need to create object to call
		
	}

	public void Sam() {       //non static method  need to create object of class  in main method to call Sam Method 

		System.out.println("Sam method Run");
	}
	
	public void Ram() {       //non static method  need to create object of class  in main method to call Ram Method 
		
		System.out.println("Ram method Run");
	}
	
	public static void sunil()
	{
		System.out.println("Sunil static method");
	}
	
	
	
	
	
}

		
	