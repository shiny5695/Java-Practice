package arrays;

public class rightRotateAnArray2Variations {

	public static void main(String[] args) {
		int arr[] = {5,6,1,2,3,7};
		rightRotateAnArray2Variations array = new rightRotateAnArray2Variations();
		array.rightRotateByOne(arr);
	}

	//TC : O(N)
	//SC : O(1) -> existing array only , no extra space 
	void rightRotateByOne(int[] arr) {
		int temp = arr[arr.length-1];
		for(int i = arr.length-1; i > 0; i--) {
			arr[i] = arr[i-1];
		}
		arr[0] = temp;
		
		for(int i : arr) {
			System.out.println("new array : " + i);
		}
	}
	
	
    void rightRotateByN(int[] arr) {
		
	}
    
}
