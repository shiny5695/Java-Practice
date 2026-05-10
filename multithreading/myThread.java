package multithreading;

//Define the thread by extending Thread
class MyThread extends Thread {
 public void run() {
     for (int i = 1; i <= 5; i++) {
         System.out.println(Thread.currentThread().getName() + " - Count: " + i);
         try {
             Thread.sleep(500); // Pause for half a second
         } catch (InterruptedException e) {
             System.out.println(e);
         }
     }
 }
 
 public static void main(String ...args) {
	     MyThread t1 = new MyThread();
	     MyThread t2 = new MyThread();
	     
	     t1.start(); // Start thread 1
	     t2.start(); // Start thread 2
	 } 
 }
