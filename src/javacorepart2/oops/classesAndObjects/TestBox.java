package javacorepart2.oops.classesAndObjects;

public class TestBox {

	public static void main(String[] args) {

		Box ups = new Box();
		Box fedex = new Box();
		
		ups.length = 5;
		ups.width = 5;
		
		//ups.calculateArea();
		ups.calculateAreaAndReturn(10, 10);
		System.out.println("-----------------");
		
		int upsArea = ups.calculateAreaAndReturn();
		
		fedex.length = 200;
		fedex.width = 10;
		
		fedex.calculateArea();
		int fedExArea = fedex.calculateAreaAndReturn();
		
		int FedExModifiedArea = fedex.calculateAreaAndReturn(5);

		
		System.out.println("Total Area: " + (upsArea + fedExArea));
		System.out.println("Modified Area " + FedExModifiedArea);

	}

}
