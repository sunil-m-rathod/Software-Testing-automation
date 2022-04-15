package b5AbstracClass;
//partial abstraction 
//hiding the implementation logic is called Abstraction
//abstract class can contain abstract and non abstract method 
// we can not create object of abstract class 
// we can create constructor of Abstract class 



public abstract class Demo {          //Abstract  Class

	
	
	public abstract void Display();    //Abstract method. we can only declared abstract method 
	
	public Demo() {                    //Constructor of abstract class but can not call in child method
		
		System.out.println("Demo consructor output");
	}
	

	public void input() {
		System.out.println("abstact demo class input metod  ");
	}
	 
		
		


}
