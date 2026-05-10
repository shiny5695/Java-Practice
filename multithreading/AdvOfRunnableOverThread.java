package multithreading;

public class AdvOfRunnableOverThread implements Runnable{ // you can still extend a class

	public static void main(String[] args) {
		
		AdvOfRunnableOverThread runnable = new AdvOfRunnableOverThread();
		//runnable.yield(); no yield method for this
		//runnable.interrupt(); no interrupt methd here
		two t = new two();
		t.yield(); 
		t.interrupt();

	}

	@Override
	public void run() {
	System.out.println("Run implementation for runnable interface");
		
	}
	

}

class two extends Thread { //now u cant extend anything else cz of multiple inheritance
	
	
	@Override
	public void run() {
	System.out.println("Run implementation fr thread class");
		
	}
	
}
