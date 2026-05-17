package arrays;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromSortedArrayInPlace {

	//return new size of the array
	public static void main(String[] args) {
		
		int arr[] = {1,1,1,2,2,3,3};
		//bruteForce(arr);
		//bruteForce2(arr);
		optimal(arr);
		
	}
	
	
	static void bruteForce(int[] arr) {
		Set<Integer> set = new LinkedHashSet<>();
		for(int i : arr) {
			set.add(i);
		}
		
		int index = 0;
		for(int i : set) {
			// arr[i] = set. u cant access set contents directly
			arr[index] = i;
			index++;
		}
		
		for(int i = 0; i < index; i++) {
		    System.out.print(arr[i] + " ");
		}
	}
	

//	static void bruteForce2(int[] arr) {
//		for(int i = 0; i < arr.length;i++) {
//			for(int j = i+1; j < arr.length; j++) {
//				if(arr[i] != arr[j]) {
//					arr[i+1] = arr[j];
//				}
//			}
//		}
//		System.out.println("new array size according to bruteforce 2 " + );
//	}

	static void optimal(int[] arr) {	
		int index = 0;
		for(int j = 1; j < arr.length;j++) {
				if(arr[index] != arr[j]) {	
					arr[index+1] = arr[j];
					index++;
				}
		}
		System.out.println("new array size according to optimal " + (index+1));
	}
}
