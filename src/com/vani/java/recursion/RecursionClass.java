package com.vani.java.recursion;

public class RecursionClass {
	
	
	int findFactorial(int n) {
		if (n==1) {
			return 1;// exit condition from recursionloop
		}
		else {
			return(n*findFactorial(n-1));
		}
	}

	public static void main(String[] args) {
		RecursionClass rc= new RecursionClass();
		int fact=rc.findFactorial(10);
		System.out.println("Factorial   is " +fact);

	}

}
