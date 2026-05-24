package arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MajorityElement {

	public static void main(String[] args) {
		
		//int[] arr = {7,7,5,1,1,1,5,5,1,1,7,7,5,5,5,5};
		int[] arr = {2,2,1,1,2,2,2};
		//7s : 4
		//1s : 5
		//5s : 7 
		//bruteForceUsingTwoLoops(arr, arr.length);
		//betterUsingHashMap(arr,arr.length);
		bestUsingMooresVotingAlgo(arr,arr.length);
		
	}

	private static void bruteForceUsingTwoLoops(int[] arr, int n) {
		for(int i = 0; i < arr.length;i++) {
			int count = 0;
			for(int j = 0; j< arr.length;j++) {
				if(arr[j] == arr[i]) {
					count++;
				}
			}
			if(count > n/2) {
				System.out.println("Majority is : " + arr[i]);
				return;
			}
		}
		System.out.println("No majority element");
	}

	private static void betterUsingHashMap(int[] arr, int n) {
		Map<Integer,Integer> map = new HashMap<>();
		for(int i = 0; i< arr.length;i++) {
//			if(map.containsKey(arr[i])) {
//				
//			}
			map.put(arr[i],  map.getOrDefault(arr[i], 0) + 1);
		}
		
		for(Entry<Integer, Integer> en : map.entrySet()) {
			 if(en.getValue() > n/2) {

		            System.out.println(

		                "Majority element is : "

		                + en.getKey()

		            );

		            return;
			 }
		}
	}

	private static void bestUsingMooresVotingAlgo(
	        int[] arr, int n) {

	    int candidate = 0;
	    int count = 0;

	    // phase 1 -> find candidate
	    for(int num : arr) {

	        if(count == 0) {

	            candidate = num;
	        }

	        if(num == candidate) {

	            count++;
	        }

	        else {

	            count--;
	        }
	    }

	    // phase 2 -> verify
	    count = 0;

	    for(int num : arr) {

	        if(num == candidate) {

	            count++;
	        }
	    }

	    if(count > n/2) {

	        System.out.println(
	            "Majority element is : "
	            + candidate
	        );
	    }

	    else {

	        System.out.println(
	            "No majority element"
	        );
	    }
	}
	

}
