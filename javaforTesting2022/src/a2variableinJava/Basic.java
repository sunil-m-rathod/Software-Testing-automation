package a2variableinJava;

public class Basic {
	
	//Instance or global variable : Inside class but outside method
	
	int c=50;              //Instance or global variable applicable to non-static method inside class
	
	static int d=10;       //work on both method(static and non static) inside class
	
	public static void main(String[] args) {

		
		
		
		
   int z;                //Declaration of variable
   
   int b=10;            //initialization of variable
		
	     Basic a=new Basic();
	     a.Method1();
		
	     method2();

	}
	
	 public void Method1()
	 {
		 int a =20;           //Local variable used inside method, applicable only particular method
		 
		 System.out.println("NON STATIC METHOD  value inside local variable :" + a);
		 
		 System.out.println("NON STATIC METHOD value inside global variable :" + c);
		 
		 System.out.println("NON STATIC METHOD value inside static variable :" + d);
		 
		
	 }
	 
	 public static void method2()
	 {
		 // System.out.println("value inside global variable" + c);  //global variable not work in static variable
		 
		 System.out.println("STATIC METHOD value inside static variable :" + d);
		 
	
		 
	 }
	

}
