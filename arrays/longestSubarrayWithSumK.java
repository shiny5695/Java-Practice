package arrays;

import java.util.ArrayList;
import java.util.List;

public class longestSubarrayWithSumK {


	public static void main(String ... args) {
		
		int[] arr = {1,2,3,1,1,1,1};
		bruteForce(arr, 5);
		
	}
	
	static void bruteForce(int[] arr,int sum) {
		//List<List<Integer>> list = new ArrayList<>();
		int maxLengthCounter = -1;
		for(int i = 0; i < arr.length; i++) {
			int sumCounter = 0;
			for(int j = i; j < arr.length; j++) {
				 sumCounter += arr[j];
				 if(sumCounter == sum) {
					maxLengthCounter = Math.max(maxLengthCounter, j-i+1); 
				 } 
				 if (sumCounter > sum) {
					 break;
				 }
				 
				// System.out.println();
			}
		}
		System.out.println("Max length is :" + maxLengthCounter);
	}
}

