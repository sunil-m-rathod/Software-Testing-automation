package a7Loop;

public class A {

	public void show() {
	
		//FOR LOOP
	
	for (int i=1;i<=10;i++) {    
	
		System.out.println(i);
	}
		
		for (int i=10;i>=1;i--) {    
		
			System.out.println(i);
			
	}
/**************************************************/
		//print table
		
		int n=7;
		for(int i=1;i<=10;i++) {
			
			System.out.println("7*"+i+" = "+i*n);
		}
		
}
	/********************************************************/
	
	//While loop
	
	public void whileLoop() {
		int n=9;
		int i=1;
		while(i<=10) {
			System.out.println("whileloop 9*"+ i+" ="+i*n);
			i++;
		}
	
	}
  /***********************************************************************/
	 //for each loop
	
	public void foreachloop() {
		
		int []a= {25,45,78,95,69,85};       //for each loop use with array
		
		for(int z:a) {
			System.out.println(z);
		}
	}
	
/**************************************************************************************************/	
	// Do while Loop
	
	  public void dowhileloop()
	  {
		         int i=1;
				  do {
					  System.out.println(i);
					  i++;
					   } while( i<=10);
	  }
	
	
}
