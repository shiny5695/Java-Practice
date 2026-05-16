package arrays;

import java.util.Arrays;

public class ThirdLargestElementInAnArray {

	static int[] arr = {5,1,3,2,7,7,0};
	
	public static void main(String[] args) {
		ThirdLargestElementInAnArray large = new ThirdLargestElementInAnArray();
		//large.bruteForce(Arrays.copyOf(arr,arr.length));
		//large.better(Arrays.copyOf(arr,arr.length));
		large.optimal(Arrays.copyOf(arr,arr.length));
	}
	
	
	//TC : O(nlogn) + O(2n)
	//SC : O(1)
	void bruteForce(int[] arr) {
		Arrays.sort(arr);
		//if unique then : 
		//System.out.println("Third Largest element using bruteForce approach is : " + arr[arr.length-3]);
		
		int largest = arr[arr.length-1];
		int secondLargest = -1;
		int thirdLargest = -1;
		for(int i = arr.length-2; i >= 0; i--) {
			if(arr[i] != largest) {
				secondLargest = arr[i];
				break;
			} 
		}
		
		System.out.println("Second Largest element using bruteForce approach is : " + secondLargest);
		
		for(int i = arr.length-2; i >= 0; i--) {
			if(arr[i] != largest && arr[i] != secondLargest) {
				thirdLargest = arr[i];
				break;
			}
		}
		
		System.out.println("Third Largest element using bruteForce approach is : " + thirdLargest);
	}
	
	//TC : O(3n) 
	//SC : O(1)
	void better(int arr[]) {
		
		int largest = Integer.MIN_VALUE;
		int secondLargest = -1;
		int thirdLargest = -1;
		
		//find largest 
		for(int i = 1; i < arr.length-1;i++) {
			if(arr[i] > largest) {
				largest = arr[i];
			}
		}
		
		//find second largest 
		for(int i = 0; i < arr.length-1;i++) {
			if(arr[i] > secondLargest && arr[i] < largest) {
				secondLargest = arr[i];
			}
		}
		
		//find third largest
		for(int i = 0; i < arr.length-1;i++) {
			if(arr[i] < secondLargest && arr[i] < largest && arr[i] > thirdLargest) {
				thirdLargest = arr[i];
			}
		}
		
		System.out.println("Third Largest element using better approach is : " + thirdLargest);
		
	}
	
	//TC : O(N)
	//SC : O(1);
	void optimal(int arr[]) {
	
		int largest = arr[0];
		int secondLargest = -1;
		int thirdLargest = -1;
		
		for(int i = 1; i < arr.length-1;i++) {
			if(arr[i] > largest) {
				thirdLargest = secondLargest;
				secondLargest = largest;
				largest = arr[i];
			} else if(arr[i] > secondLargest && arr[i] < largest) {
				thirdLargest = secondLargest;
				secondLargest = arr[i];
			} else if(arr[i] > thirdLargest && arr[i] < secondLargest) {
				thirdLargest = arr[i];
			}
		}
		
		System.out.println("Third Largest element using optimal approach is : " + thirdLargest);
	}

}
