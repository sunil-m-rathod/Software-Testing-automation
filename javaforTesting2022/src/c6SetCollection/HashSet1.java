package c6SetCollection;

import java.util.HashSet;

public class HashSet1 {

	public static void main(String[] args) {

// hash Set
// by using index location can't add value in Hashset
//Not allow duplicate value 
//value will be added randomally
		
		HashSet<Integer> set=new HashSet();
		
		set.add(10);
		set.add(20);
		set.add(10);
		set.add(30);
		set.add(40);
		set.add(50);
		
		set.add(null);

    System.out.println(set);	
		
	    
	    set.remove(30);             //for removing value 
    System.out.println(set);
		
		
		HashSet<Object> set1=new HashSet();
		set1.add(new Integer(34));
		set1.add(new String("Hello"));
		set1.add(new Float(23.89));
	System.out.println(set1);
	}

}
