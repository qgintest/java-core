package javacorepart2.oops.overriding;

/*Overriding: When a method of the same name in a sub-class gets called instead of the method
in the super class

	Purpose: it allows yuo to define behavior that's specific to the subclass type
	while still implementing a parent class method
https://www.tutorialspoint.com/java/java_overriding
 */

public class Animal {

	public static void main(String[] args) {
		Animal a = new Animal();
		Animal b = new Dog();

		a.move();
		b.move();
		// b.bark();

	}

	public void move() {
		System.out.println("Animals can move");
	}

}

class Dog extends Animal {
	public void move() {
		// super.move();
		System.out.println("Dogs can walk and run");
	}

	public void bark() {
		System.out.println("Dogs can bark");
	}
}
