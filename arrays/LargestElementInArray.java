package arrays;

import java.util.Arrays;

public class LargestElementInArray {

	static int[] arr = {5,1,3,2,7,7,0};
	
	public static void main(String[] args) {
		LargestElementInArray large = new LargestElementInArray();
		large.bruteForce(arr);
		large.optimal(arr);

	}
	
	
	//TC : O(nlogn) 
	//SC : O(1)
	void bruteForce(int[] arr) {
		Arrays.sort(arr); //TC : O(nlogn) --> why? 
		System.out.println("Largest element using bruteforce is : " + arr[arr.length-1]);
	}
	
	void better(int arr[]) {
	
	}
	
	//TC : O(n)
	//SC : O(1)
	void optimal(int arr[]) {
		int largest = arr[0];
		for(int i = 1; i < arr.length;i++) {
			if(arr[i] > largest) {
				largest = arr[i];
			}
		}
		System.out.println("Largest element using optimal approach is : " + largest);
	}

}
