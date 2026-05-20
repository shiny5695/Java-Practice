package arrays;

public class findTheNumberThatAppearsOnceInsteadOFTwice {

	public static void main(String[] args) {
		
		int arr[] = {1,1,2,2,4,5,5};
		//bruteforce(arr);
		optimalXOR(arr);
		
	}

	static void bruteforce(int[]arr) {
		
		for(int i = 0; i < arr.length;i++) {
			int counter = 0;
			for(int j = 0; j < arr.length;j++) {
				if(arr[j]==arr[i]) {
					counter++;
				}
			}
			if(counter == 1) {
				System.out.println("No appearing once is : " + arr[i]);
				break;
			}
			
		}
		
	}
	
	static void optimalXOR(int[]arr) {
		
		int xor1 = 0;
		for(int i = 0; i < arr.length;i++) {
			xor1 ^= arr[i];
		}
		System.out.println("No appearing once by XOR is : " + xor1);
	}
}
