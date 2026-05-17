package arrays;

import java.util.ArrayList;
import java.util.List;

public class MoveAllZeroesToTheEnd {

	public static void main(String[] args) {
		
		int arr[] = {5,0,0,6,0,1,2,0,3,7};
		int counter = 0;
		//bruteForceWithExtraSpace(arr);
		optimalApproach(arr);
	}

	//TC : O(N) + O(Diff) + O(Diff) 
	//SC : O(N)
	private static void bruteForceWithExtraSpace(int[] arr) {
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i <arr.length;i++) {
//			if(arr[i]==0) {
//				counter++;
//			}
			if(arr[i] != 0) {
				list.add(arr[i]);
			}	
		}
		
		System.out.println(list);
		
		int diff = arr.length-list.size();
		for(int i = 0; i < list.size(); i++) {
			arr[i] = list.get(i);
		}
		
		for(int i = list.size(); i < arr.length;i++) {
			arr[i] = 0;
		}
		
		for(int i : arr) {
			System.out.println("new arr" + i);
		}
	}
	
	//uses two pointer approach 
	static void optimalApproach(int[] arr) {
		int index = 0;
		for(int i = 0; i <arr.length;i++) {
			if(arr[i]!=0) {
				arr[index] =arr[i];
				index++;
			}
		}
		
		for(int i = index; i <arr.length; i++) {
			arr[i] = 0;
		}
		
		for(int i : arr) {
			System.out.println("new arr" + i);
		}
	}

}
