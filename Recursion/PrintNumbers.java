package Recursion;

public class PrintNumbers {

	public static void main(String[] args) {
	
		System.out.println("Hello World ");
		recurr(5);

	}
	
	static void recurr(int num) {
	 	//IBH - Induction, Base condition, Hypothesis
		//B
		if(num ==1 ) {
			System.out.println(num);
			return;
		}
		//H
		System.out.println(num);
		//I
		recurr(num-1);
	}

}





