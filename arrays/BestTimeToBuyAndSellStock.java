package arrays;

public class BestTimeToBuyAndSellStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {7,1,5,3,6,4};
		bruteforce(arr);
		optimal(arr);
	}
	
	static void bruteforce(int arr[]) {
		int maxProfit = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j] > arr[i]) {
					maxProfit = Math.max(maxProfit, arr[j] - arr[i]);
				}
			}
		}
		System.out.println("bruteforce : " + maxProfit);
	}
	
	static void optimal(int[] arr) {
		int minPrice = Integer.MAX_VALUE;
		int maxProfit = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] < minPrice) {
				minPrice = arr[i];
			} else if(arr[i] - minPrice > maxProfit) {
				maxProfit = arr[i] - minPrice;
			}
		}
		System.out.println("optimal : " + maxProfit);
	}
}
