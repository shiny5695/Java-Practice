package arrays;

import java.util.Arrays;

public class SecondLargestElementInArray {

	static int[] arr = {5,1,3,2,7,7,0};
	
	public static void main(String[] args) {
		SecondLargestElementInArray large = new SecondLargestElementInArray();
		large.bruteForce(Arrays.copyOf(arr,arr.length));
		large.better(Arrays.copyOf(arr,arr.length));
		large.optimal(Arrays.copyOf(arr,arr.length));
	}
	
	
	//TC : O(nlogn) 
	//SC : O(1)
	void bruteForce(int[] arr) {
		Arrays.sort(arr); //TC : O(nlogn) --> why? 
		//if all are unique 
		//System.out.println("Second Largest element using bruteforce is : " + arr[arr.length-1]); 
		//otherwise : 
		int largest = arr[arr.length-1];
		int secondLargest = -1;
		for(int i = arr.length-2; i > 0; i--) {
			if(arr[i] != largest) {
				secondLargest = arr[i]; 
				break;
			} 
		}
		System.out.println("Second Largest element using bruteForce approach is : " + secondLargest);
	}
	
	//TC : O(n) 
	//SC : O(1)
	void better(int arr[]) {
		int largest = arr[0];
		int secondLargest = -1;
		
		//find largest first
		for(int i = 1; i < arr.length;i++) {
			if(arr[i] > largest) {
				largest = arr[i];
			} 
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < largest && arr[i] > secondLargest) {
				secondLargest = arr[i];
			} 
		}
		
		System.out.println("Second Largest element using better approach is : " + secondLargest);
		
	}
	
	//TC : O(n)
	//SC : O(1)
	void optimal(int arr[]) {
		int largest = arr[0];
		int secondLargest = -1;
		for(int i = 1; i < arr.length;i++) {
			if(arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			} 
		}
		System.out.println("Second Largest element using optimal approach is : " + secondLargest);
	}

}
