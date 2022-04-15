package b3SuperKeyword;

public class RuntimePolymorphism {

	public static void main(String[] args) {

         B b1 = new B();
         
         B b2 =new B(15,58);
    
     b1.show();  //result showing both method of Class A and B.SUPER keyword
     
     b1.test();   //calling test method of A CLASS No need SUPER keyword because method name is different 
     
     
       //super();  denote default constructor of parent in java

	}

	
}
