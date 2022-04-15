package b2Polymorphism;

public class RunTimePolymorphism {

	public static void main(String[] args) {
	
		//** Compile time poymorphism (method overloading) **
	
		B b1 = new B ();          
		b1.show();            //by default showing method B only (method name same in A and B CLASS) 
		                      //not showing Parent class A method
		
//** Run Time Polymorphism (Method overriding ) dynamic method dispatch **
		
		A a2 =new B();    //Reference is of parent Class A And created Object of child class B.
	
         a2.show();        //showing method of Parent Class A But showing in Output B class. 
      
		
	}

}
