package arrays;

import java.util.HashMap;
import java.util.Map;

public class FindMissingNumberInAnArray {

	public static void main(String[] args) {
	
		int arr1[] = {1,2,4,5};
		int N = 5;
		//bruteforce(arr1,N);
		//better(arr1,N);
		//betterUsingHashing(arr1,N);
//		optimal(arr1,N);
		//optimal1Sum(arr1,N);
		//optimalXOR(arr1, N);
		mostOptimalXOR(arr1, N);

	}

	private static void bruteforce(int[] arr1, int N) {
		for(int i = 1; i < N; i++) {
			boolean flag = false;
			for(int j = 0; j <arr1.length;j++) {
				if(arr1[j] == i) {
					flag = true;
					break;
				}
			}
			if(flag == false) {
				System.out.println("missing no is : " + i);
			}
		}
	}
	
	private static void better(int[] arr1, int N) {
		Map<Integer,Integer> map = new HashMap<>();
		for(int i = 1 ; i <= N; i++) {
			map.put(i, 0);
		}
		
		// mark present numbers as 1
	    for(int i = 0; i < arr1.length; i++) {
	        map.put(arr1[i], 1);
	    }

	    // find whose value is still 0
	    for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
	        if(entry.getValue() == 0) {
	            System.out.println("Missing number is : " + entry.getKey());
	        }
	    }
	}

	private static void betterUsingHashing(int[] arr1, int N) {

	    int[] hash = new int[N + 1];

	    // mark present elements
	    for(int i = 0; i < arr1.length; i++) {
	        hash[arr1[i]] = 1;
	    }

	    // find missing number
	    for(int i = 1; i <= N; i++) {

	        if(hash[i] == 0) {
	            System.out.println("Missing number is : " + i);
	        }
	    }
	}
	
	private static void optimal1Sum(int[] arr1, int N) {
		int sum = 0;
		int sumOfN = (N*(N+1))/2;
		for(int i = 0; i < arr1.length; i++) {
			sum += arr1[i];
	    }
		
		int ans = sumOfN - sum;
		System.out.println("missing no is : " + ans);

	}

	private static void optimalXOR(int[] arr1, int N) {

	    int xor1 = 0;
	    int xor2 = 0;

	    // XOR from 1 to N
	    for(int i = 1; i <= N; i++) {
	        xor1 ^= i;
	    }

	    // XOR of array
	    for(int i = 0; i < arr1.length; i++) {
	        xor2 ^= arr1[i];
	    }

	    int ans = xor1 ^ xor2;

	    System.out.println("Missing number is : " + ans);
	}
	
	private static void mostOptimalXOR(int[] arr1, int N) {

	    int xor1 = 0;
	    int xor2 = 0;

	    //arr1 = {1,2,4,5};
	    //N = {1,2,3,4,5}
	    
	    // XOR from 1 to N
	    for(int i = 1; i < N-1; i++) {
	        xor1 ^= i;
	        xor2 ^= arr1[i+1];
	    }
	    xor1 ^= N;

	    System.out.println("Xor of all numbers : " + xor1);
	    System.out.println("Xor of all array no : " + xor2);
	    System.out.println("Xor of all numbers : " + xor1);
	    System.out.println("Difference is  : " + (xor1-xor2));
	}
	
}
