package arrays;

public class BasicsOfArrays {

	static int[] arrGlobal = new int[5]; //0s
	int arrNew[] = new int[2]; //another type of declaration
	
	public static void main(String[] args) {
		
		int arrLocal[] = new int[4]; //initialized by 0s
		
		//using normal for loop
		for(int i = 0; i <= arrLocal.length-1;i++) { //i < arrLocal.length means  
			System.out.println(arrLocal[i]);
		}

		//using for each
		for(int i : arrGlobal) {
			System.out.println(arrGlobal[i]);
		}
		
		anotherArray another = new anotherArray();
		another.methodRandom(); //still 0s
		
		String[] strArray = new String[10];
		double[] doubleArray = new double[10];
		float[] fltArray = new float[10];
		
	}


}

class anotherArray {
	
	void methodRandom() {
		int[] arrMethod = new int[2];
		for(int i = 0; i < arrMethod.length;i++) {
			System.out.println(arrMethod[i]);
		}
	}
}
