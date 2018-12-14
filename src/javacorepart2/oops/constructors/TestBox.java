package javacorepart2.oops.constructors;

public class TestBox {

	public static void main(String[] args) {

		SmallBox obj = new SmallBox();
		obj.calculateArea();
		
		SmallBox ups = new SmallBox(3,4);
		ups.calculateArea();
	}

}
