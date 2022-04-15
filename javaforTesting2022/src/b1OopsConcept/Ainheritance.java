package b1OopsConcept;

public class Ainheritance extends  Binheritance {                       // Class A is child of B CLASS

	public static void main(String[] args) {
		
	//need to create object of class A child class to access properties of Parent class B	
	
		Ainheritance O = new Ainheritance();
		O.dislay();             //A CLASS METHOD
		O.show();               //B CLASS METHOD
	}
	
	
	public void dislay() {
		
		System.out.println("A class display metod");
	}
	
}
	
