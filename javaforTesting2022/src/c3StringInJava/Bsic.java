package c3StringInJava;

public class Bsic {

	public static void main(String[] args) {
		

		//String is immutable :Original value not change 
		
	String a11=new String (" sunil rathod ");
	
	String a1=new String ("SMR");
	
	
	
		
		String str_upper=a11.toUpperCase();
		
		System.out.println(str_upper);
	/*******************************************************/
		
		char x=a11.charAt(4);
		System.out.println("character at 4 location :"+x);
		
	/***********************************************************/
		int n=a11.length();
		System.out.println("Length of str = "+n);
	
	   /*******************************************************/
	   
		char str_array[]=a11.toCharArray();
		for(int i=0;i<n;i++)
		{
			System.out.println(str_array[i]);
		
		}
	
		
	/*******************************************************/
		boolean z=a11.startsWith("su");
		System.out.println("Result startsWith: "+z);
		
		
		boolean y=a11.endsWith("od");
		System.out.println("Result endsWith: "+y);
	/**********************************************************/
		
		int q=a11.compareTo("sunil rathod");
		System.out.println("Compare Strings:"+q);
	
		/*************************************************/
		boolean s=a11.equals("sunil");
		System.out.println("Equality of Strings : "+s);
		
		boolean b=a11.equalsIgnoreCase("jj");
		System.out.println("Equality of Strings Equals Ignore Case: "+b);
		
		/***********************************************************/
		
		String replace_string=a11.replace('a', '1');
		
		String replace_complete=a11.replace(a11,a1);
		
		System.out.println("replace complete :"+replace_complete);
		
		System.out.println("replace o with - :"+replace_string);
		
		/*************************************************************/
		 
		
		//Trim(remove Leading and Trailing Space)
                      String Trim_SR=a11.trim();
                      
                       System.out.println(Trim_SR);
                       
      /***********************************************************************/
                       //Split String
                      
                     String []aa=a11.split(" ");
                     
                     for(String q1:aa) {
                    	 
                    	 System.out.println(q1);
                     }
	} 
	
	
	
	

}
