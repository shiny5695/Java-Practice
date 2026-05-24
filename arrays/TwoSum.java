package arrays;

import java.util.ArrayList;
import java.util.List;

public class TwoSum {

	public static void main(String[] args) {
	
		int[] arr = {2,6,5,8,11};
		int sum = 14;
		//2 varieties : return target found or not, return indexes
		bruteforce(arr,sum);
		bruteforceMultiplePairs(new int[] {1,2,3,4,5}, 5);

	}
	
	static void bruteforce(int[]arr, int target) {
		//List<List<Integer>> list = new ArrayList<>();
		int[] newArr = null;
		for(int i = 0; i <arr.length; i++) {
			for(int j = i+1; j <arr.length;j++) {
				if(arr[i] + arr[j] == target) {
					newArr = new int[] {i,j};
				}
			}
		}
		
		for(int i : newArr) {
			System.out.println("Indexes are : " + i + " " );
		}
	}
	
	static void bruteforceMultiplePairs(int[]arr, int target) {
		List<int[]> list = new ArrayList<>();
		for(int i = 0; i <arr.length; i++) {
			for(int j = i+1; j <arr.length;j++) {
				if(arr[i] + arr[j] == target) {
					list.add(new int[] {i,j});
				}
			}
		}
		
		for(int[] l : list) { 
			for(int i : l) {
				System.out.print("Multiple pairs bruteforce is : " + i + " ");
			}
			System.out.println();
		}
		
		
	}
	
	static void better(int[]arr, int target) {
		
	}
	
	static void optimal(int[]arr, int target)  {
		
	}

}
