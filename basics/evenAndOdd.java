package basics;

public class evenAndOdd {

	public static void main(String[] args) {
		
		
		int num = 2;
		if(num==0) {
			System.out.println(num + " is neither even nor odd number");
		} else if(num%2==0) {
			System.out.println(num + " is even number");
		} else {
			System.out.println(num + " is odd number");
		}

	}

}
