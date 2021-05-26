package recursion;

public class Recursion {
	/**
	 * Simulate a loop using recursion
	 * for (int i = start; i < end; i++)
	 * @param start start of the loop counter
	 * @param end Terminate the loop when start == end
	 * @param increment Add to start each pass through the loop
	 * @return the current value of the loop counter. 
	 */
	public static int loop(int start, int end, int increment) {
		
		// base case
		if (start == end) {return end;}

		// Print something just so we can see that the logic is working
		System.out.println("loop(" + start + ", " + end + ", " + increment + ")");
		
		return loop(start + increment, end, increment);
		
	}

}
