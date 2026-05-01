package Recursion;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseAStackUsingRecursion {

	public static void main(String[] args) {
		

		Stack<Integer> stack = new Stack<>();
		stack.push(5);
		stack.push(4);
		stack.push(3);
		stack.push(2);
		stack.push(1);
	
		System.out.println(stack);
		//stack = reverseIterative(stack);
		//reverseStack(stack);
		recursive(stack);
		System.out.println(stack);

	}

	//extra O(n) space with iterative
	private static Stack<Integer> reverseIterative(Stack<Integer> stack) {
		
		Stack<Integer> temp = new Stack<Integer>();
		while(!stack.isEmpty()) {
			temp.push(stack.pop());
			
		}
		return temp;		
	}
	
	//Again extra space but same stack
	static void reverseStack(Stack<Integer> stack) {
	    Queue<Integer> queue = new LinkedList<>();

	    // Step 1: stack → queue
	    while (!stack.isEmpty()) {
	        queue.add(stack.pop());
	    }

	    // Step 2: queue → stack
	    while (!queue.isEmpty()) {
	        stack.push(queue.remove());
	    }
	}
	
	//recursive 
	static void recursive(Stack<Integer> stack) {
		if(stack.isEmpty()) {
			return;
		}
		int popval = stack.pop();
		recursive(stack);
		insertAtBottom(stack,popval);
	}

	private static void insertAtBottom(Stack<Integer> stack, int popval) {
		if(stack.isEmpty()) {
			stack.push(popval);
			return;
		}
		
		int temp = stack.pop();
		insertAtBottom(stack,popval);
		stack.push(temp);
	}
	
	
	

}
