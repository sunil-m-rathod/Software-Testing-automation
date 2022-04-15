package b7AccessModifierPractice;

import b6AccessModifier.*;  //* ==indicate all class from package

//need to create object of class AccessmodifierPractice child class to access properties of Parent class A

public class AccessmodifierPractice extends A{  //CLASS inheritance here

	public static void main(String[] args) {

       //when we create object in Other package we need to import package  
       //only Public method is accessible, when we create object in other package (Private,Default,Protected not accessible)
	  //When class is inheritance then Public and protected method is accessible	
     //public and protected method accessible only in other package 
	 	A a2 = new A();
		
		a2.test_public();    // 
		
		 AccessmodifierPractice a3 = new  AccessmodifierPractice();
		 
		 a3.test_protected();    //protected method
		 a3.test_public();       //public method
	

	}

}
