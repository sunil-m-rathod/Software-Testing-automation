package a5Constructor;

public class Constructor {

	public static void main(String[] args) {
	
		Constructor o = new Constructor ();     // when constructor are use multiple time object name should be change (o,o1,o2)
		
		Constructor o1 = new Constructor (45,78);  // constructor are automatically get call. we no need to call them.
		
		Constructor o2 = new Constructor (25,78);

	}

	// when we create multiple constructor we can not have same number of argument and data type. 
	
	public  Constructor() {                       // without argument parameter 
		System.out.println("Sunil Rathod");
		
	}
	
	public  Constructor(int a,int b) {              // with argument parameter 
		int c=a+b;
		
		System.out.println(c);
		
	}
	
	
}
