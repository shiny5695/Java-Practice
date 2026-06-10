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
	
	//another approach 
	static int thirdLargest(int[] arr) {
        int n = arr.length;
        
        // If the array has less than 3 elements, return -1
        if (n < 3) {
            return -1;
        }
        
        // Pass 1: Find the first maximum element and remember its index
        int first = -1;
        int first_idx = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > first) {
                first = arr[i];
                first_idx = i;
            }
        }
        
        // Pass 2: Find the second max element by skipping the EXACT index of the first
        int second = -1;
        int second_idx = -1;
        for (int i = 0; i < n; i++) {
            if (i == first_idx) continue; 
            
            if (arr[i] > second) {
                second = arr[i];
                second_idx = i;
            }
        }
        
        // Pass 3: Find the third largest element by skipping the indices of first and second
        int third = -1;
        for (int i = 0; i < n; i++) {
            if (i == first_idx || i == second_idx) continue; 
            
            if (arr[i] > third) {
                third = arr[i];
            }
        }
        
        // Return the third largest element 
        return third;
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
