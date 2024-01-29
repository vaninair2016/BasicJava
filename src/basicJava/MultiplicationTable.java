package basicJava;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number to find out multiplicaton table : ");
		int num=sc.nextInt();
		int res;
		for(int i=1;i<=10;i++) {
			//res=num*i;
			System.out.println(i+"*" +num+"= "+(res=num*i));
		}
	}

}
