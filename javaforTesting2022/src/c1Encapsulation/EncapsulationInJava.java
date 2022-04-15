package c1Encapsulation;

public class EncapsulationInJava {

	public static void main(String[] args) {
		
		Demo d=new Demo();
		
  //by using  generate getters and setters method,we will access private variable
		
		d.setM(23);       
		float e=d.getM();              //imp
		
		System.out.println("Value of m: "+e);
		
		
	}

}