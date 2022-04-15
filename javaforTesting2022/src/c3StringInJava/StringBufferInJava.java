package c3StringInJava;

public class StringBufferInJava {

	public static void main(String[] args) {
	
		//if we made any changes in string it will affect on original String.
		
		StringBuffer sb=new StringBuffer("HelloProgramming");
		
		sb.append("Java");                 //append: attach at end of original string   
		System.out.println(sb);
		
		sb.insert(5, "-");                //insert
		System.out.println(sb);
		
		sb.insert(6, " Object Oriented ");
		System.out.println(sb);
	
		sb.replace(0, 5, "Hi");              //replace
		System.out.println(sb);
		
		sb.reverse();                      //reverse 
		System.out.println(sb);
		
		System.out.println(sb.length());
		
		// sb.insert(40, "test");           //out of length : give exception 
		
		sb.insert(16, "-------");
		System.out.println(sb);
		
		
	}

}