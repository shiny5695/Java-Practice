package arrays;

public class leftRotateAnArray2Variations {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
		leftRotateAnArray2Variations array = new leftRotateAnArray2Variations();
		//array.leftRotateByOne(arr);
		//array.leftRotateByNBruteForce(arr,3);

	}
	
	//TC : O(N)
	//SC : O(1) -> existing array only , no extra space 
	void leftRotateByOne(int[] arr) {
		int temp = arr[0];
		for(int i = 1; i < arr.length; i++) {
			arr[i-1] = arr[i];
		}
		arr[arr.length-1] = temp;
		
		for(int i : arr) {
			System.out.println("new array : " + i);
		}
	}
	
	
    void leftRotateByNBruteForce(int[] arr, int n) {
    	int[] tempArray = new int[n];
    	for(int i = 0; i < n; i++) {
    		tempArray[i] = arr[i];
    	}
		
    	for(int i = 0; i < (arr.length-n);i++) {
    		arr[i] = arr[n+i];
    	}
    	
//    	for(int i = n; i < (arr.length) && i > 0 ;i++) {
//    		arr[i] = tempArray[n-i];
//    	}
    	
    	 // place temp elements at end
    	for(int i = 0; i < n; i++) {
            arr[arr.length - n + i] = tempArray[i];
        }
    	
    	for(int i : arr) {
			System.out.println("new array : " + i);
		}
	}
    
    //TODO
    void leftRotateByNOptimal(int[] arr, int n) {
    	
    }
	
	
}
