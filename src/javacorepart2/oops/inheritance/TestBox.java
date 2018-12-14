package javacorepart2.oops.inheritance;

public class TestBox {

	public static void main(String[] args) {

		Box fedEx = new Box();
		
		fedEx.calculateArea(3, 4);
		
		//the new ups box has access to both methods due to inheritance of the Box class
		NewBox ups = new NewBox();
		ups.calculateArea(3, 5);
		ups.calculateVolume(3, 4, 5);
		
		
		
		
	}

}
