package Recursion;

import java.util.Stack;

public class SortAStackUsingRecursion {

	public static void main(String[] args) {
	
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(5);
		stack.push(1);
		stack.push(0);
		stack.push(2);
		System.out.println(stack);
		makeInputSmaller(stack);
		System.out.println(stack);

	}
	
	static void makeInputSmaller(Stack<Integer> stack) {
		if(stack.size() ==1) {
			return;
		}
		int poppedVal = stack.pop();
		makeInputSmaller(stack);
		insertIntoStack(stack,poppedVal);
	}
	
	static void insertIntoStack(Stack<Integer> stack, int poppedVal) {
		if(stack.isEmpty() || stack.peek() <= poppedVal) {
			stack.push(poppedVal);
		} else {
			int popAnotherOne = stack.pop();
			insertIntoStack(stack, poppedVal);
			stack.push(popAnotherOne);
		}
		
	}

}
