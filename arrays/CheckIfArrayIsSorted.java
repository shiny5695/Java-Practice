package arrays;

import java.util.Arrays;

public class CheckIfArrayIsSorted {

	public static void main(String[] args) {
		
		int arr[] = {5,6,1,1,2,0,3,7};
	    System.out.println("bruteforce result : " +   bruteForce(arr));
	    System.out.println("optimal result : " +   optimal(arr));
	}
	
	//TC : O(Nlogn+n)
	//SC : O(N)
	static boolean bruteForce(int[] arr) {
		int arrDuplicate[] = Arrays.copyOf(arr, arr.length); //extra space
		Arrays.sort(arrDuplicate);
//		if(arr == arrDuplicate) {
//			return true;
//		} 
		
		for(int i = 0; i < arr.length; i++) {
	        if(arr[i] != arrDuplicate[i]) {
	           return false;
	        }
	    }
	    return true;
	}

	//TC : O(N)
	//SC : O(1)
	static boolean optimal(int[] arr) {
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] < arr[i-1]) {
				return false;
			}
		}
		return true;
	}
}
