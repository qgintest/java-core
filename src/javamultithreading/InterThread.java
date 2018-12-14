package javamultithreading;

public class InterThread {

	public static void main(String[] args) {

	}

}

//incomplete example
class Q{
	int n;
	
	synchronized int get(){
		System.out.println("Got: " + n);
		return n;
	}
	
	
}
