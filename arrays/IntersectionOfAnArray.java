package arrays;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfAnArray {

	public static void main(String[] args) {
	
		int arr1[] = {1,2,3,4,5};
		int arr2[] = {3,4,5,6,7};
		
		//bruteforce(arr1,arr2);
		optimal(arr1, arr2);
	}

	//2 ptr 
	private static void optimal(int[] arr1, int[] arr2) {
		int i = 0;
		int j = 0;
		List<Integer> list = new ArrayList<>();
		while(i < arr1.length && j < arr2.length) {
			if(arr1[i] == arr2[j]) {
				list.add(arr1[i]);
				j++;
				i++;
			} else {
				i++;
			}
		}
		System.out.println(list);
		
	}

	private static void bruteforce(int[] arr1, int[] arr2) {
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr2.length; j++) {
				if(arr2[j] == arr1[i]) {
					list.add(arr1[i]);
				}
			}
		}
		System.out.println(list);
		
	}

}
