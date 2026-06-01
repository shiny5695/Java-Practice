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
	
	static void optimal(int[] prices) {
		 int minPrice = prices[0];
		    int maxProfit = 0;
		    for(int i = 1; i < prices.length; i++) {
		        int profit = prices[i] - minPrice;
		        maxProfit = Math.max(maxProfit, profit);
		        minPrice = Math.min(minPrice, prices[i]);
		    }

		    System.out.println(maxProfit);
	}
}
