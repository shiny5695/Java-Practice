package arrays;

public class LinearSearchInAnArray {

	public static void main(String[] args) {
		int arr[] = {5,6,1,2,3,7};
		int n = 3;
		for(int i = 0; i<arr.length;i++) {
			if(arr[i]==n) {
				System.out.println("Found the key : " + n);
				break;
			}
		}

	}

}
