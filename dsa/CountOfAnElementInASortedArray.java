package dsa;

public class CountOfAnElementInASortedArray {

	public static void main(String[] args) {
		int[] arr = {2,10,10,10,10,10,14};
        int k = 10;
        int noOfElements = lastOcc(arr,k) - firstOcc(arr,k) +1;
        System.out.println("Ans is : " + noOfElements);

	}
	
	static int firstOcc(int[] arr,int k) {
		int start = 0;
		int end = arr.length-1;
		int result = -1;
		while(start<=end) {
			int mid = start + (end - start)/2;
			if(arr[mid] ==k) {
				result = mid;
				end = mid - 1;
			} else if(k < arr[mid]) {
				end = mid - 1;
			}else if(k > arr[mid]) {
				start = mid + 1;
			}
		}
		System.out.println("First occ : " + result);
		return result;
	}
	
	static int lastOcc(int[] arr, int k) {
		int start = 0;
		int end = arr.length-1;
		int result = -1;
		while(start<=end) {
			int mid = start + (end - start)/2;
			if(arr[mid] ==k) {
				result = mid;
				start = mid + 1;
			} else if(k < arr[mid]) {
				end = mid - 1;
			}else if(k > arr[mid]) {
				start = mid + 1;
			}
		}
		System.out.println("Last occ : " + result);
		return result;
	}

}
