package dsa.binarySearch;

public class FindANumberInASortedRotatedArray {

	public static void main(String[] args) {
	
		int[] arr = {22,23,24,26,2,4,5,6,9};
		int start = 0;
		int end = arr.length-1;
		int result = -1;
		int k = 23;
		
		while(start<=end) {
			int mid = start+(end-start);
			int prev = (mid - 1 + arr.length) % arr.length;
			int next = (mid+1)%arr.length;
			if(arr[mid]== k) {
				result = mid;
				break;
			}
			// is 28 2 9--> no
			if(arr[prev] >= arr[mid] && arr[mid] <= arr[next]) {
				result = mid;
				break;
			}
			
			
		}
		
		System.out.println("Rtated at : " + result);

	}

}
