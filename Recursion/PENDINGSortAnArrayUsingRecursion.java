package Recursion;

public class PENDINGSortAnArrayUsingRecursion {

	//pending
	public static void main(String[] args) {
		
		int arr[] = {1,3,4,0};
		sort(arr, arr.length);

	}
	
	static void sort(int arr[], int length) {
		
		if(length == 1) {
			return;
		}
		int last = arr[arr.length-1];
		sort(arr, length-1);
		insert(arr, arr.length, last);
	}
	
	static void insert(int arr[], int lenght, int last) {
		if(arr.length == 0 || arr[arr.length-1] <= last) {
			arr[arr.length-1] = last;
		}
		 // shift element right
        arr[arr.length-1] = arr[arr.length - 1 -1 ];

        // recursive call
//        insert(arr, n - 1, temp);
		
		
		
	}

}
