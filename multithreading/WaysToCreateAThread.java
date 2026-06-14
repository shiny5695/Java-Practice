package multithreading;

public class WaysToCreateAThread {

	public static void main(String[] args) {
		//print something using both ways of creating a thread - each 5 times but alternate between the two ways.
		
		
		for(int i = 0; i <5; i++) {
			//u cant start a thread multiple times dude
			usingThreadClass thread1 = new usingThreadClass();
			thread1.start();
		}
		
		for(int i = 0; i <5; i++) {
			Thread thread2 = new Thread(new usingRunnableInterface());
			thread2.start();
		}
		//TODO : Use wait and notify to alternate between the two threads
	}
	
}

class usingThreadClass extends Thread {
	
	public void run() {
		System.out.println("Thread created by extending Thread class");
	}
}

class usingRunnableInterface implements Runnable {
	
	//@Override
	public void run() {
		System.out.println("Thread created by implementing Runnable interface");
	}
}