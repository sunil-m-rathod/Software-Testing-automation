package c5CollectionInJava;

import java.util.Stack;

public class Stack3 {

	public static void main(String[] args) {

  Stack<Integer> list=new Stack();
		
//to add ::PUSH
  
    list.push(10);
    list.push(20);
    list.push(30);
    list.push(40);
		
	System.out.println(list);
    
  //to check which object on top ::PEEK
	
	System.out.println(list.peek());
	
 //to remove top element and check 2nd on top::pop
	list.pop();
	
	System.out.println(list.peek());
	
	}

}
