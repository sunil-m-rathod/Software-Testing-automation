package c6SetCollection;


import java.util.TreeSet;

public class TreeSet3 {

	public static void main(String[] args) {
        //by using index location can't add
		//maintain order
		//duplicate not allowed
		//element order sorted ***

		
	    TreeSet<Integer> set=new TreeSet();
	    
			
	    set.add(10); 
	    set.add(30);
	    set.add(60);
	    set.add(50);
	    set.add(20);
	    
			
			System.out.println(set);
			
			set.remove(60);            //remove using value .not remove using index location because value added randomly 
					
			System.out.println(set);
		
		
	}

}
