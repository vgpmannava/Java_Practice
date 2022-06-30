package com.practice.collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueuePractice {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Queue<String> queue = new PriorityQueue<>();
		queue.add("Vinay");
		queue.add("Rahul");
		queue.add("Ajay");
		queue.add("Shreyas");
		
		System.out.println("Print queue elements...."+queue);
		
		  // Printing the top element of the PriorityQueue
        System.out.println(queue.peek());
 
        // Printing the top element and removing it from the PriorityQueue container
        System.out.println(queue.poll());
 
        // Printing the top element again
        System.out.println(queue.peek());
        
        System.out.println("Print queue elements...."+queue);
		
	}

}
	