package arrays;

import java.util.HashSet;

public class threesum {

	public static void main(String[] args) {
		int[] arr = {-1, 0, 1, 2, -1, -4};
		int target = 0;
		bruteForce(arr, target);
	}
	
	static void bruteForce(int arr[], int target) {
		for(int i = 0; i < arr.length - 2; i++) {
			for(int j = i + 1; j < arr.length - 1; j++) {
				for(int k = j + 1; k < arr.length; k++) {
					if(arr[i] + arr[j] + arr[k] == target) {
						System.out.println("Triplet found: " + arr[i] + ", " + arr[j] + ", " + arr[k]);
					}
				}
			}
		}
	}
	
	static void usingHashSet(int arr[], int target) {
		for(int i = 0; i < arr.length - 1; i++) {
			HashSet<Integer> set = new HashSet<>();
			int currentTarget = target - arr[i];
			for(int j = i + 1; j < arr.length; j++) {
				if(set.contains(currentTarget - arr[j])) {
					System.out.println("Triplet found: " + arr[i] + ", " + arr[j] + ", " + (currentTarget - arr[j]));
				}
				set.add(arr[j]);
			}
		}
	}

}
