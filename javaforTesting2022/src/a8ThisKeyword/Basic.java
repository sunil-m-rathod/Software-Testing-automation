package a8ThisKeyword;

public class Basic {

  int v=20;	
	public static void main(String[] args) {
		
		
		 Basic b=new  Basic();
		 
		 b.test();
		
	}
	
	public void test()
	{
		int a=10;
		System.out.println("local variable :" +a);      //using local variable
		
		System.out.println("Global variable :"+ this.v);   //using this keyword,we use global variable in method.
	}
}
