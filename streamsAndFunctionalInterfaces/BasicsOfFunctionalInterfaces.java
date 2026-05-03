package streamsAndFunctionalInterfaces;

public class BasicsOfFunctionalInterfaces {

	public static void main(String[] args) {
		
		//first : before java8 - everything had to be associated to a class - hence everything needs an object.
		//even if you have one interface with one abstract method, you are obligated to create a child class implementing
		//this interface and method and then an object creation mandatory for accessing this one method
		
		exampleFunctionalInterface example = new beforeJava8();
		System.out.println(example.add(5, 5));
		
		//second : came anonymous inner class 
		//this avoided the mandatory class creation and reduced some boilerplate code and eased developers life
		//you can do it for thread class ka run method too
		exampleFunctionalInterface example1 = new exampleFunctionalInterface() {
			@Override
			public int add(int a, int b) {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		System.out.println(example1.add(5, 2));
		
		//third : now comes Functional Interfaces - one step ahead of anon inner classes. 
		//give the implementation on the go - uses lambda expressions to define the implementation
		//again reduces boilerplate code
		exampleFunctionalInterface example2 = (a,b) -> (a*b); //i overrode (is that even a word, with multiplication instead of add
		System.out.println(example2.add(2, 2));
		
	}

	
}


@FunctionalInterface 
// totally optional annotation but if added, it will restrict addition of any new abstract method by giving compiler error
interface exampleFunctionalInterface {
	
	int add(int a, int b);

	
	//btw u can add static and default methods here without any issue
	
	static void staticmethod() {
		
	}
	
	default void defaultMethod() {
		
	}
}

class beforeJava8 implements exampleFunctionalInterface{

	@Override
	public int add(int a, int b) {
		return a+b;
	}
	
	
}
