package javamultithreading;

public abstract class CurrentThreadDemo {

	public static void main(String[] args) {

		Thread t = Thread.currentThread();
		
		System.out.println("Current Thread: " + t);
		
		//Change the name of the thread
		t.setName("Abe's Thread");
		
		try{
			for(int n = 5; n > 0; n--){
				System.out.println(n);
				Thread.sleep(1000);
			}
			
		}catch(InterruptedException e){
			System.out.println("Main Thread Int");
		}
	}

}
