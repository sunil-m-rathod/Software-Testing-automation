package b4Interface;

public class Demo implements SBI,Axis {       // (implement) keyword is used to connect Class(DEMO) ANd Interface (SBI)
	                                          //multiple Interface added

	public static void main(String[] args) {
		

		
		SBI a = new Demo();   //Reference created for Interface and object of created for Class
		                      // to hide information provide (reference of interface and object of class)
		
		a.input_account(24644654);
		a.show_interest();
		
		Axis a1 = new Demo();  // reference of Axis provided and object of created for Class   
		a1.show_interest1();
		a1.show_CarLoan();     //Rbi method also showing because of extends (by using Axis reference)
	}

	  // Interface all method need to define in Class 
	 //we can not create object of interface and we can't have constructor 
	 // method are declared in Interface, need to define in normal class 
	
	public void show_interest()
	{
		System.out.println(" saving account interest 4%");
		
	}
	public void input_account(int a)
	{
		System.out.println("account details = "+a);
		
	}
	
	public void show_interest1()
	{
		System.out.println(" Axis saving account interest 8%");
		
	}
	public void show_CarLoan()
	{
		System.out.println(" Rbi carloan interest =" + n);
		
	}
}
