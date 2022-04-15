package b3SuperKeyword;

public class B extends A {

public B() {        //CONSTUCTOR OF CLASS B
		
	  
		System.out.println("B CLASS CONSTUCTOR");
		
	}
	
public B(int a,int b) {        //CONSTUCTOR OF CLASS A with parameter
	 
	super(a);              //parent class A CONSTRUCTOR call
	System.out.println("B CLASS CONSTUCTOR Valu of b ="+b);
	
}

	
public void show() {
		
	     super.show();       //method of parent class A  (super Keyword inside child class) CONSTUCTOR OF class A also grt call. 
	     super.test();       //method test of Class A 
		System.out.println("CLASS B METHOD");
	}
	
}
