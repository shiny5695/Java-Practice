package dsa;

public class BinarySearchOnReverseSortedArray {

	public static void main(String[] args) {
		
		int[] arr = {20,17,15,13,9,4};
		//find k = 9;
		
		int k = 20;
		int start = 0;
		int end = arr.length-1;
		while(start<=end) {
			int mid = start + (end-start)/2;
			if(k == arr[mid]) {
				System.out.println("found at index : " + mid);
				return;
			} else if(k < arr[mid]) {
				start = mid+1;
			} else if(k > arr[mid]) {
				end = mid-1;
			}
		}
		System.out.println("Not found anywhere");
	}

}
