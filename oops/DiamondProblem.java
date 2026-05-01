package oops;

//Ambiguity problem
public class DiamondProblem extends B{

   public static void main(String ...args) {
	   
	   B b = new B();
	   b.property();
	   
	   C c = new C();
	   c.property();
	   
	   DiamondProblem diamondProblem = new DiamondProblem();
	   diamondProblem.property();
	   
   }
	
}


class A {
	
	void property() {
		System.out.println("GrandParents property");
	}
}

class B extends A {
	
 // by default has access to property
}

class C extends A {
	
	 // by default has access to property
	
}