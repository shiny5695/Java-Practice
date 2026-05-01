package Recursion;

public class HeightOfABinartTree {

	public static void main(String[] args) {
	
     //construct the binary tree first
		
	 //then call the height method
     
	}
	
	static int height(Node node) {
		
		if(node == null) {
			return 0;
		}
		int lh = height(node.lh);
		int rh = height(node.rh);
		return 1 + Math.max(lh, rh); //(1 is added so that we consider the root level also)
	}

}

class Node {
	
	int a;
	Node lh;
	Node rh;
	
}
