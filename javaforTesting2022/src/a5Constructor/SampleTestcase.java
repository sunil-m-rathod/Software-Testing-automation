package a5Constructor;

public class SampleTestcase {

	public static void main(String[] args) {

		SampleTestcase P = new SampleTestcase();
		
		P.TC001();
		P.TC002();
		P.TC003();
		

	}

	public SampleTestcase() {      //constructor are used for initialization. 
		
		System.out.println("code for open browser + url");	
	}
	
	//before executing test case we need to open browser + url (same for all ) to reduce same work we create Constructor.
	//BEFORE fetching data from database we need connection that time also use
	
	public void TC001() {
		
		System.out.println("program for test case 1");
	}
	
    public void TC002() {
		
		System.out.println("program for test case 2");
	}
      public void TC003() {
	
	System.out.println("program for test case 3");
}
	
}
