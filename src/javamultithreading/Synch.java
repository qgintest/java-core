package javamultithreading;

//The call method below gets called by three thread at any given time. This causes a race condition to occur. to fix this, 
//seralize access to call() - restrict access to only one thread at a time
class Callme{
	synchronized void call(String msg){
		System.out.print("[" + msg);
		try{
			Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("Interrupted");
		}
		System.out.println("]");
	}
}

class Caller implements Runnable{
	String msg;
	Callme target;
	Thread t;
	
	public Caller(Callme targ, String s){
		target = targ;
		msg = s;
		t = new Thread(this);
		t.start();
	}
	public void run() {
		
		//if you don't have access to the reference class, you can add syncrhonized block below for the method being called
//		synchronized(target){
//			target.call(msg);
//		}
		
		target.call(msg);
	}
}

public class Synch {

	public static void main(String[] args) {
			Callme target = new Callme();
			Caller ob1 = new Caller(target, "Hello");
			Caller ob2 = new Caller(target, "Syncrhonized");
			Caller ob3 = new Caller(target, "World");
			
			// wait for threads to end
			try{
				ob1.t.join();
				ob2.t.join();
				ob3.t.join();
			}catch(InterruptedException e){
				System.out.println("Interrupted");
			}
	}
}
