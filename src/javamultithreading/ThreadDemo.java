package javamultithreading;

public class ThreadDemo {

	public static void main(String[] args) {

		NewThread th1 = new NewThread("First Thread"); //create a new Thread
		NewThread th2 = new NewThread("Second Thread"); //create a new Thread
		NewThread th3 = new NewThread("Third Thread"); //create a new Thread

		System.out.println("Thread One is alive: " + th1.t.isAlive());
		System.out.println("Thread One is alive: " + th2.t.isAlive());
		System.out.println("Thread One is alive: " + th3.t.isAlive());

		
		try{
			System.out.println("Waiting for Threads to finish");
			th1.t.join();
			th2.t.join();
			th3.t.join();
			//Thread.sleep(10000);
//			for(int i = 5; i > 0; i--){
//				System.out.println("Main Thread: " + i);
//				Thread.sleep(1000);
//			}
		}catch(InterruptedException e){
			System.out.println("Main Thread interrupted.");
		}
		
		System.out.println("Thread One is alive: " + th1.t.isAlive());
		System.out.println("Thread One is alive: " + th2.t.isAlive());
		System.out.println("Thread One is alive: " + th3.t.isAlive());
		
		System.out.println("Exiting Main thread.");
		
	}

}

class NewThread implements Runnable{

	String name;
	Thread t;
	
	NewThread(String threadName){
		//Create a new second Thread
		name = threadName;
		t = new Thread(this, name); 
		System.out.println("Child Thread: " + t);
		t.start();
	}
	
	//entry point for second thread
	public void run() {

		try{
			for(int i = 5; i > 0; i--){
				System.out.println("Child Thread: " + i);
				Thread.sleep(500);
			}
		}catch(InterruptedException e){
			System.out.println("Child interrupted.");
		}
		System.out.println("Exiting child thread.");
	}
	
}
