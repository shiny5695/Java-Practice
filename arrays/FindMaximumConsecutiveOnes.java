package arrays;

public class FindMaximumConsecutiveOnes {

	public static void main(String[] args) {
		
		int[] arr = {1,1,0,1,1,1,0,1,1,1,1, 1};
		
		bruteforce(arr);

	}

	
	static void bruteforce(int[] arr) {

		int counter = 0;
		int maxCount = 0;
		for(int i =0; i < arr.length;i++) {
//			for(int j = i+1; j < arr.length;j++) { // not required
				 if(arr[i] != 1) {
					 //reset counter;
					 counter = 0;
				 } else {
					 counter++;
				 }
			//}
			maxCount = Math.max(counter,maxCount);
		}
		
		System.out.println("Max consecutive ones : " + maxCount);
	}
}
