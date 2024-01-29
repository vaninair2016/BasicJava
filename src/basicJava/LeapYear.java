package basicJava;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		int count=5;
		for (int i=1;i<count;i++){
				
				 Scanner sc= new Scanner(System.in);
		System.out.println("Enter 4 didgit year: ");
		int year= sc.nextInt();
		if (year%4==0 ||  year%400==0 || year%100==0) {
			System.out.println(+year +" is a leap year");
		}
//		else if(year%400==0) {
//			System.out.println(+year +" is a leap year");
//		}
//		else if (year%100==0) {
//			System.out.println(+year +" is a leap year");
//		}
		else {
			System.out.println(+year +" is not a leap year");
		}
		
		}

	}
}


