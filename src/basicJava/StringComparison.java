package basicJava;

import java.util.Scanner;

public class StringComparison {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first String: ");
		String first= sc.nextLine();
		Scanner sc1= new Scanner(System.in);
		System.out.println("Enter the second String: ");
		String second= sc1.nextLine();
		sc.close();
		sc1.close();
		
		if (first.equalsIgnoreCase(second)){
			System.out.println("Strings are same");
		}
		else {
			System.out.println("Strings are not same");
		}

	}

}
