package closure;

import java.util.function.Function;

public class Closure {
	
	public static void demo() {
		Function<Integer, String> myNewFunction = myClosure(100);
		Function<Integer, String> anotherNewFunction = myClosure(-1);

		System.out.println("Closure Demo...");
		System.out.println(myNewFunction.apply(42));
		System.out.println(anotherNewFunction.apply(42));
		
	}
	
	/**
	 * A function that returns a function
	 * @param increment the number to add to the argument passed to the function we are creating
	 * @return a function that accepts an integer and adds increment to it
	 */
	public static Function<Integer, String> myClosure(int increment) {
	
		return x -> Integer.toString(x + increment);
	}
}
