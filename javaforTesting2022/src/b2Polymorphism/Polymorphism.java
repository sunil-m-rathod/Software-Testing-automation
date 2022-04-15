package b2Polymorphism;

public class Polymorphism {

	public static void main(String[] args) {
		
		//NAME WILL BE SAME BUT IT PERFORMING DIFFERENT TASK
	    // Compile Time polymorphism ====Method overloading
	    //Within same class

		Polymorphism A = new Polymorphism();
		
	   A.show(50);
		
	  A.show();
		
	
	}

	
	public void show(int a) {
		System.out.println("show method a :"+a);	
	}
	
	public void show() {
		System.out.println("show method without parameter");
	}
}
