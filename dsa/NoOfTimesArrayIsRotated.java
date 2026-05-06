package dsa;

public class NoOfTimesArrayIsRotated {

	public static void main(String[] args) {
	
		int[] arr = {22,23,24,26,2,4,5,6,9};
		int start = 0;
		int end = arr.length-1;
		int result = -1;
		while(start<= end) {
			//need to understand this
			if (arr[start] <= arr[end]) {
			    result = start;
			    break;

			}
			int mid = start+(end-start)/2;
			int prev = (mid - 1 + arr.length) % arr.length;
			int next = (mid + 1) % arr.length;
			// mid is minimum
            if (arr[mid] <= arr[next] && arr[mid] <= arr[prev]) {
                result = mid;
                break;

            } else if(arr[start] <= arr[mid]) {
				start = mid + 1;
			} else  {
				end = mid - 1;
			}
		}
		System.out.println("Array is rotated at : " + result);

	}

}
