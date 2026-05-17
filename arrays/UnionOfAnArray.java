package arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UnionOfAnArray {

	public static void main(String[] args) {
		
		int arr1[] = {1,2,3,4,5};
		int arr2[] = {3,4,5,6,7};
		
		//bruteforce(arr1,arr2);
		optimal(arr1, arr2);

	}
	
	//TC : O(N) + O(M)
	//SC : O(N) + O(M)
	static void bruteforce(int[] arr1,int[] arr2) {
		
		Set<Integer> set = new HashSet<>();
		for(int i = 0; i < arr1.length;i++) {
			set.add(arr1[i]);
		}
		
		for(int i = 0; i < arr2.length;i++) {
			set.add(arr2[i]);
		}
		
		System.out.println("final arr" + set);
	}
	
	
	static void optimal(int[] arr1,int[] arr2) {
		int i = 0;
		int j = 0;
		List<Integer> list = new ArrayList<>();
		//compare both elements 
		while(i < arr1.length && j < arr2.length) {
			if(arr1[i] < arr2[j]) {
				if(list.isEmpty() || list.getLast() != arr1[i]) {
				  list.add(arr1[i]);
//				  i++;
				}
			i++;
			} else if(arr2[j] < arr1[i]) {
			  if(list.isEmpty() || list.getLast() != arr2[j]) {
			  list.add(arr2[j]);
//			  j++;
			  }
			j++;
			} else { //equal i am gonna take from array 1
				 if(list.isEmpty() || list.getLast() != arr1[i]) {
					  list.add(arr1[i]);
//				 	  i++;
//					  j++;
				 }
				 i++;
					j++;
			}
		}
		
		//second list got exhausted but first still has elements
		while(i < arr1.length) {
			if(list.isEmpty() || list.getLast() != arr1[i]) {
				list.add(arr1[i]);
//				i++;
				}
			 i++;
		}
		
		//first list got exhausted but second still has elements
	    while(j < arr2.length) {
		   if(list.isEmpty() || list.getLast() != arr2[j]) {
				list.add(arr2[j]);
//				j++;
				}
		   j++;
		}
	
		System.out.println("union list with optimal approach : " + list);
	}

}
