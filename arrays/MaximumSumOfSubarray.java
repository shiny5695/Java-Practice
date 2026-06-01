package arrays;

public class MaximumSumOfSubarray {

	public static void main(String[] args) {

		int[] arr = {-2,-3,4,-1,-2,1,5,-3};
		
		//bruteforceUsingThreeLoops(arr);
		better(arr);
		kadanesAlgo(arr);
	}

	private static void bruteforceUsingThreeLoops(int[] arr) {
		int maxSum = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length;i++) {
			for(int j = i; j< arr.length; j++) {
				int sum = 0;
				for(int k = i ; k <=j;k++) {
					sum += arr[k];
				}
				maxSum = Math.max(maxSum, sum);
			}
		}
		System.out.println(maxSum);
	}

	private static void better(int[] arr) {
		int maxSum = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length;i++) {
			int sum = 0;
			for(int j = i; j< arr.length; j++) {
				sum += arr[j];
				maxSum = Math.max(sum,maxSum);
			}
		}
		System.out.println(maxSum);
	}

	private static void kadanesAlgo(int[] arr) {
		
	}

}
