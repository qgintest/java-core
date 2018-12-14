package java8.lambda;

public interface DoubleNumericArrayFunc {

	double func(double [] n) throws EmptyArrayException;
}

class EmptyArrayException extends Exception{
	EmptyArrayException(){
		super("Array Empty");
	}
}
