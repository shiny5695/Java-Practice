package arrays;

import java.util.Arrays;

public class SortZeroesOnesAndTwoes {

	public static void main(String[] args) {
		
		int[] arr = {0,1,1,0,1,2,1,2,2,0};
		//bruteForceUsingSort(arr);
		//betterUsingCounters(arr);
		bestUsingDutchNationalFlagAlgo(arr);

	}

	private static void bruteForceUsingSort(int[] arr) {
//		Arrays.sort(arr);
		//bubble sort or merge sort
		for(int i : arr) {
			System.out.print(i + " ");
		}
	}

	private static void betterUsingCounters(int[] arr) {
		int zeroCounter = 0;
		int oneCounter = 0;
		int twoCounter = 0;
		
		for(int i = 0; i< arr.length;i++) {
			if(arr[i] == 0) {
				zeroCounter++;
			} else if(arr[i] == 1) {
				oneCounter++;
			} else {
				twoCounter++;
			}
		}
		
		int index = 0;
		for(int i = 0; i< zeroCounter;i++) {
			arr[index++] = 0;
		}
		
		System.out.println("index after 0 " + index);
		
		for(int i = 0; i < oneCounter;i++) {
			arr[index++] = 1;
		}
		
		for(int i = 0; i < twoCounter;i++) {
			arr[index++] = 2;
		}
		
		for(int i : arr) {
			System.out.print(i + " ");
		}
		
		
	}

	private static void bestUsingDutchNationalFlagAlgo(int[] arr) {
		 int low = 0;

		    int mid = 0;

		    int high = arr.length - 1;

		    while(mid <= high) {

		        if(arr[mid] == 0) {

		            int temp = arr[low];

		            arr[low] = arr[mid];

		            arr[mid] = temp;

		            low++;

		            mid++;

		        }

		        else if(arr[mid] == 1) {

		            mid++;

		        }

		        else {

		            int temp = arr[mid];

		            arr[mid] = arr[high];

		            arr[high] = temp;

		            high--;

		        }

		    }

		    System.out.println(Arrays.toString(arr));
		
	}
	

}
