package basicJava;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number ");
		int num=sc.nextInt();
		int result;
		for(int i=1;i<num/2;i++) {
			result=num%i; 
		}
		if (result){
			System.out.println("Number is not prime");
		}
		else {
			System.out.println("Number is  prime");
		}
	}

}
