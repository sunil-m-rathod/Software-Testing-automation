package c6SetCollection;

import java.util.LinkedHashSet;

public class LinkedHashSet2 {

	public static void main(String[] args) {


    LinkedHashSet<Integer> set=new LinkedHashSet();
    
//by using index location can't add value		
 //maintain order
 //duplicate not allowed
	
         set.add(10); 
         set.add(30);
         set.add(60);
         set.add(50);
         set.add(20);
    
		set.add(null);
		
		System.out.println(set);
		
		set.remove(60);            //remove using value .not remove using index location because value added randomly 
				
		System.out.println(set);
		
		
		
	}

}
