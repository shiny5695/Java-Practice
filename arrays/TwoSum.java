package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

//There are may variations to this : first ask the interviewer if first pair needs to be returned., all pairs or unique pairs
public class TwoSum {

	public static void main(String[] args) {
	
		int[] arr = {2,6,5,8,11};
		int sum = 14;
		//2 varieties : return target found or not, return indexes
//		bruteforce(arr,sum);
//		bruteforceMultiplePairs(new int[] {1,2,3,4,5}, 5);
//		better(arr,sum);
//		betterWithUniquePairs(new int[] {2,2,1,3,3,1},4);
		optimalUsingGreedyAndSort(new int[] {2,6,5,8,11},14);
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
		Map<Integer,Integer> map = new HashMap<>();
		List<int[]> result = new ArrayList<>();
		Integer secondNum = -1;
		for(int i = 0; i <arr.length; i++) {
			if(map.containsKey(target-arr[i])) {
				result.add(new int[] {i,secondNum});
			} else {
				map.put(arr[i], i);
			}
		}
		
//		for(int[] l : result) { 
//			for(int i : l) {
//				System.out.print("Multiple pairs better solution is : " + i + " ");
//			}
//			System.out.println();
//		}
		
		// print pairs

	    for(int[] pair : result) {
	        System.out.println(

	            "Pair indexes are : " +

	            pair[0] + " " + pair[1]

	        );

	    }
		
	}
	
	//1,3 and 3,1 should be considered as one pair
	private static void betterWithUniquePairs(int[] arr, int sum) {
		Map<Integer,Integer> map = new HashMap<>();
		Set<List<Integer>> set = new HashSet<>();
		for(int i = 0; i <arr.length;i++) {
			int needed = sum-arr[i];
			if(map.containsKey(needed)) {
				  int first = Math.min(arr[i], needed);
		          int second = Math.max(arr[i], needed);
		          set.add(Arrays.asList(first, second));
			} 
				map.put(arr[i], i);
			
		}
		
		System.out.println("Unique pairs using set are : " + set);
		
	}
	
	//partially wrong cz m directly sorting the original array and not returning the original indexes
	private static void optimalUsingGreedyAndSort(int[] arr, int target) {
		
		int left = 0; int right = arr.length-1;
		List<List<Integer>> list = new ArrayList<>();
		Arrays.sort(arr);
		while(left < right) {
			int sum = arr[left] + arr[right];
			if( sum == target) {
				list.add(Arrays.asList(left,right));
				break;
			} else if (sum < target) {
				left++;
			} else {
				right--;
			}
		}
		
		System.out.println(list);
		
	}

}
