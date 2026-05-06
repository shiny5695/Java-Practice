package dsa;

public class BinarySearchFirstAndLastOccurenceOfAnElement {

	public static void main(String[] args) {
		
		int[] arr = {2,4,6,10,10,10,14};
		//find k = 10 find first occurence;
		
		int k = 10;
		int start = 0;
		int end = arr.length-1;
		int result = -1;
		while(start<=end) { 
			int mid = start + (end - start) / 2;
			if(k == arr[mid]) {
				result = mid;
				end = mid - 1;
			
			} else if(k < arr[mid]) {
				end = mid - 1;
			} else if(k>arr[mid]) {
				start = mid +1;
			}
		}
		System.out.println("Result is : " + result);
	}

}
