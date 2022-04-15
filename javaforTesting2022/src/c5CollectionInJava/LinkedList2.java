package c5CollectionInJava;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList2 {

	public static void main(String[] args) {
		
		
//when we are strored 100 object in arraylist and remove using index method. when 5 th index value remove.every index will get change 
//it is time consuming for index update in arraylist
		
 // Linked list 
//faster than arraylist because,it will store next  object address  	
// arraylist and Linkedlist allow Null value	and duplicate value
			
			
			LinkedList<Integer> list=new LinkedList();   //create object of LinkedList
			
			list.add(new Integer(10));
			list.add(new Integer(20));
			list.add(new Integer(10));
			list.add(new Integer(40));
			
			list.add(2,new Integer(30));
			list.add(23);
			list.add(null);
			
			System.out.println(list);
			
			list.remove(0);              //value remove as per index
			
			System.out.println(list);
			
			Iterator<Integer> i=list.iterator();   //iterator of integer//to show array value one by one use iterator
			
			while(i.hasNext())                    //hasNext method  check next value 
			{
				System.out.println(i.next());
			}
			
			LinkedList<Object> list1=new LinkedList();
			list1.add(new Integer(34));
			list1.add(new String("Hello"));
			list1.add(new Float(23.89));
			System.out.println(list1);
		

	}

}
