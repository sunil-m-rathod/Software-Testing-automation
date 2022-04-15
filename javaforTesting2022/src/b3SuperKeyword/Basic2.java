package b3SuperKeyword;

public class Basic2 extends Basic1 {

	int x=25;          //instance variable  
	
	public static void main(String[] args) {

		Basic2 v=new Basic2();
		
		v.test();
		
		
	}

	public void test()
	{
		int x=15;
		System.out.println("local variable :"+ x);            //local variable get
	
		System.out.println("instance variable :"+ this.x);             //instance variable get.
		System.out.println("variable from other class :"+ super.x);   //instance variable Of Basic1 CLASS get .
		
	}
}
