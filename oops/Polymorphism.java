package oops;

public class Polymorphism {


	public static void main(String[] args) {
		
		Parent p = new child();
		p.print(); //--> will print child if non static methods, otherwsie will print child
		//you cannot override static methods
	}

}


class Parent {
	
	static void print() {
		System.out.println("Parent");
	}
}


class child extends Parent {
	
	static void print() {
		System.out.println("Child");
	}
}
