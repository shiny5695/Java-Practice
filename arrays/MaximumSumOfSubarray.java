package arrays;

public class MaximumSumOfSubarray {

	public static void main(String[] args) {

		int[] arr = {-2,-3,4,-1,-2,1,5,-3};
		
		//bruteforceUsingThreeLoops(arr);
		//better(arr);
		kadanesAlgo(arr);
		kadanesAlgoButTrackBeginningAndEndToo(arr);
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
		int maxSum = Integer.MIN_VALUE;
		int sum = 0;
		for(int i = 0; i < arr.length;i++) {
			sum += arr[i];
			maxSum = Math.max(maxSum, sum);
			if(sum < 0) {
				sum = 0;
			}
		}
		System.out.println(maxSum);
		System.out.println("Testing git changes ");
	}

	private static void kadanesAlgoButTrackBeginningAndEndToo(int[] arr) {
	

		// Initialize maxSum to first element to correctly handle all-negative arrays
		int maxSum = arr[0];
		int currentSum = 0;
		int tempStart = 0; // potential start index for the current running subarray
		int start = 0, end = 0;

		for (int i = 0; i < arr.length; i++) {
			currentSum += arr[i];

			// Update max and indices when we find a better sum
			if (currentSum > maxSum) {
				maxSum = currentSum;
				start = tempStart;
				end = i;
			}

			// If running sum becomes negative, reset it and mark next index as potential start
			if (currentSum < 0) {
				currentSum = 0;
				tempStart = i + 1;
			}
		}

		System.out.println(maxSum);
		System.out.println("start : " + start);
		System.out.println("end : " + end);
	}
}
