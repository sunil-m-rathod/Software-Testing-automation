package b5AbstracClass;

public class Demo1 extends Demo {

	public static void main(String[] args) {


		//method are declared in Abstract class, need to define in normal class (only abstract method)  

		  Demo1 a = new Demo1();
		  a.input();
		  a.Display();
		  
		  
		  
		 
}
	
	
	 public Demo1() {
		  System.out.println("constuctor demo1");
	  }
	 
	 
	@Override
	public void Display() {
		System.out.println(" display method 11");
		
	}

	}


