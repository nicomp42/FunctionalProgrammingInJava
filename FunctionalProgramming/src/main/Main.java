/*
 * Bill Nicholson
 * nicholdw@ucmail.uc.edu
 * 
 * Demonstrate looping with recursion. We can be somewhat functional. 
 */
package main;

import closure.Closure;
import higherOrderFunctions.HigherOrderFunctions;
import recursion.Recursion;

public class Main {
	public static void main(String[] args) {
		
		Recursion.loop(0, 10, 1);	
		
		//HigherOrderFunctions.demo();
		
		Closure.demo();
	}

}

