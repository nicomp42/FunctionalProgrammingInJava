package higherOrderFunctions;

import java.util.function.Function;

public class HigherOrderFunctions {

	public static void demo() {
		myHOF( x -> Integer.toString(x * x));	// Lambda function is passed to myHOF function
	}
	
	/**
	 * Demonstrate passing a function to a function
	 * @param myFunction A function that accepts an integer and returns a string
	 */
	public static void myHOF(Function<Integer, String> myFunction) {
		String s = myFunction.apply(42);
		System.out.println("HigherOrderFunctions.myHOF(): result = " + s);
	}
}
