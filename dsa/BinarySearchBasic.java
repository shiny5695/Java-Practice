package dsa;

public class BinarySearchBasic {

	public static void main(String[] args) {
		
		int[] arr = {1,3,5,6,7,8};
		
		//find the index where k is present 
		
		int k = 1;
		
		int left = 0; //arr[0];
		int right = arr.length-1; //arr[arr.length-1];
		
		while(left<=right) { //i dnt know why <= insteaad of < 
			//int mid = left+right/2; // incorrect cz it evaluates to left + (right/2) 
			//and even if u put it as (left+right)/2 it can cause integer overflow 
			//use this : 
			int mid = left + (right - left) / 2;
			if(k == arr[mid]) {
				System.out.println("Found at index : " + mid); 
				return;
			} else if(k < arr[mid]) {
				right = mid - 1;
			} else if(k>arr[mid]) {
				left = mid +1;
//			} else {
//				System.out.println("not found"); // will never come here
//			}
			}
		}
		System.out.println("Not found");

	}

}
