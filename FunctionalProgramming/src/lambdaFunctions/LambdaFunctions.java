/*
 * Bill Nicholson
 * nicholdw@ucmail.uc.edu
 */
package lambdaFunctions;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaFunctions {

	public static void demo() {
	
		List<Integer> numbers = new ArrayList<Integer> (List.of(2,3,4,5,6,7,8,9,10,11));
		
		numbers.forEach(n -> {System.out.println(n % 2);});	// Lambda function
		
		// Lambda function. Just because we can doesn't mean we should...
		numbers.forEach(n -> {Boolean isPrime;
							  isPrime = true; 
							  if (n == 2) {isPrime = true;} 
							  for (int i = 2; i <= n/2; i++) {if (n % i == 0) {isPrime = false;}} 
							  System.out.println(n + " is " + (isPrime == true ? "": "not ") + "prime");
							 });

		// Use Lambda functions with map to build a list of just the prime numbers
	    List<Integer> primes = numbers.stream()
	                                           .map(s -> Integer.valueOf(s))
	                                           .filter(n -> checkForPrimeness(n) == true)
	                                           .collect(Collectors.toList());

	    System.out.println("Prime numbers only: " + primes);

	}
	private static Boolean checkForPrimeness (int num) {
		Boolean isPrime;
		isPrime = true; 
		if (num == 2) {isPrime = true;} 
		for (int i = 2; i <= Math.sqrt(num/2); i++) {if (num % i == 0) {isPrime = false;}} 
		return isPrime;
	}
}
