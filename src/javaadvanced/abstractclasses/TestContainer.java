package javaadvanced.abstractclasses;

public class TestContainer {

	public static void main(String[] args) {
		//also works
		//CircleContainer c1 = new CircleContainer();
		
		//super class to sub-class. can reuse objects if this way is used
		Container c1 = new CircleContainer();
		
		//cannot do
		//CircleContainer c2 = new Container();


		
		c1.calculateVolume(10, 5);
		
		SquareContainer s1 = new SquareContainer();
		s1.calculateVolume(10, 5);
		
	}

}
