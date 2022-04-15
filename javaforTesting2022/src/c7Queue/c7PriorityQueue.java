package c7Queue;

import java.util.PriorityQueue;

public class c7PriorityQueue {

	public static void main(String[] args) {

		PriorityQueue<Integer> q=new PriorityQueue();

//to add ::offer		
		q.offer(10);
	    q.offer(30);
		q.offer(40);
		q.offer(10);
		q.offer(20);
		System.out.println(q);
		
//to remove ::poll
		q.poll();
		System.out.println(q);

//next element 		
		System.out.println(q.peek());	
		
		q.poll();
		System.out.println(q);

	}

}
