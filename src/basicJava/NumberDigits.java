package basicJava;

import java.util.Scanner;

public class NumberDigits {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number: ");
		int number= sc.nextInt();
		//int num=Integer
		//System.out.println(num);
		String s=Integer.toString(number);
		System.out.println(s.length());

	}

}
