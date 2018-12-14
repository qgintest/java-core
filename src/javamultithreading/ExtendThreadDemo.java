package javamultithreading;

public class ExtendThreadDemo {

	public static void main(String[] args) {

		new NewThreadExtends();
		
		try{
			for(int i = 5; i > 0; i--){
				System.out.println("Main Thread: " + i);
				Thread.sleep(1000);
			}
		}catch(InterruptedException e){
			System.out.println("Main Thread interrupted.");
		}
		System.out.println("Exiting Main thread.");
	}

}

class NewThreadExtends extends Thread{

	//Thread t;
	
	NewThreadExtends(){
		//Create a new second Thread
		super("Demo Thread");
		System.out.println("Child Thread: " + this);
		start();
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
