package oops;

public class DiamondProblemFix implements N,O {

	public static void main(String ...args) {
		DiamondProblemFix fix = new DiamondProblemFix();
		fix.property();	
	}

	@Override
	public void property() {
		N.super.property(); //Important
	}
}

interface M {
	
	default void property() {
		System.out.println("Grandparents property");
	}
}

interface N extends M {

	@Override
	default void property() {
		System.out.println("Overriding prop N");
	}
}

interface O extends M {
	
	@Override
	default void property() {
		System.out.println("Overriding prop O");
	}
}
