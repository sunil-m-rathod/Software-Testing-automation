package c5CollectionInJava;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistList1 {

	public static void main(String[] args) {


		
		ArrayList<Integer> list=new ArrayList();   //created object of. array store similar data type 
	
//Arraylist allow Duplicate value 		
//allow Null value	
		
//To add object 
		
		list.add(10);
	    list.add(20);
	    list.add(30);
	    list.add(10);
		
	    list.add(null);
	    
	    list.add(2, 35);       //adding 35 value in index at 2
	
	    System.out.println(list);
	    
	    
	    
	    
//set to update value
  		
	    list.set(5, 50);    
	    System.out.println(list);
	    
//get method
		
  		System.out.println(list.get(3));   
  		
 //check check value present or not by Contain
  		
  		System.out.println(list.contains(50));
	    
//remove object	   
	    
		list.remove(0);             //for removing value from arraylist using index 
	    
	    System.out.println(list);
	    
//	for each loop     
	    for(int value:list)
	    {
	    	
	    	System.out.println(value);
	    }
	  		
Iterator<Integer> i=list.iterator();   //iterator of integer//to show array value one by one use iterator
		
		while(i.hasNext())                    //hasNext method  check next value 
		{
			System.out.println(i.next());
		}
	    
//	    
	    
	    
//Object is super class of all classes in java,allow any type of object		
	    
	    ArrayList<Object> list1=new ArrayList();   
		list1.add(new Integer(34));
		list1.add(new String("Hello"));
		list1.add(new Float(23.89));
		
		System.out.println(list1); 
		
	
//to Clear all object 
	//	  list1.clear();		
		
/*	memory created
 	
 	   size n
		
		n+(n/2)+1
	*/ 
		
	
		
	}

}
