package a4MethodType;

public class MethodT {

	public static void main(String[] args) {
		
		MethodT A = new MethodT();
		
		A.main1();
		

		int z=A.main3(100,20);   //store in Z
		
		A.main2(10,40);
		
	}

	public void main1() {        //non static method (No argument and No return Value)
		
		int a=45;
		int b=64;
		int c=a+b;
		
		System.out.println(c);
		
	}
	
     public void main2(int a,int b) {        //non static method (argument and No return Value)
		int c= a*b;
				
    		System.out.println(c);
    		
	}
	
     public int main3(int a,int b) {        //non static method (argument and return Value) //need to add return satement
 		int c=a+b;
 		 return c;
 	
 		
 	}
    
 
 	
	
}
