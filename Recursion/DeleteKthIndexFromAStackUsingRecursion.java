package Recursion;

import java.util.Stack;

public class DeleteKthIndexFromAStackUsingRecursion {

	public static void main(String[] args) {
		//Delete 4th element from the top
		
		// top to bottom 
		// 1 2 3 4 5
		// so delete 4
		// output : 1 2 3 5
		
		Stack<Integer> stack = new Stack<>();
		stack.push(5);
		stack.push(4);
		stack.push(3);
		stack.push(2);
		stack.push(1);
		int k = 4;
		//before : 
		System.out.println(stack);
		//delete(stack,k);
		//deleteTracker(stack, k, 0);
		deleteIterative(stack,k);
		System.out.println(stack);
		
	}
	
	static void delete(Stack<Integer> stack, int k) {
		
		if(k == 1) {
			stack.pop();
			return;
		}
		int temp = stack.pop();
		delete(stack,k-1);
		stack.push(temp);
	}
	
	//recursion part 2 with current index tracker
    static void deleteTracker(Stack<Integer> stack, int kthelement, int current) {
	
    	if(stack.isEmpty()) { return; }
    	
    	if(current == kthelement-1) {
    		stack.pop();
    		return;
    	}
    	
    	int temp = stack.pop();
    	deleteTracker(stack, kthelement, current + 1);
    	stack.push(temp);
	}
	
	//iterative version 
    static void deleteIterative(Stack<Integer> stack,int k) {
    	
    	Stack<Integer> temp = new Stack<Integer>();
    	while(k > 1) {
    		temp.push(stack.pop()); // 5 // 4 // 3 
    		k--;
    	}
    	
    	stack.pop(); // 2
    
    	while(!temp.isEmpty()) { 
    	  stack.push(temp.pop()); // 1 //3 // 4 //5 
    	}
    	
    }
	

}
