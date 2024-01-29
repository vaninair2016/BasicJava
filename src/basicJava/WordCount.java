package basicJava;

import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s= sc.nextLine();
		char[] c=s.toCharArray();
		
		int count=1;
		for(int i=0;i<=c.length-1;i++) {
			if(c[i]==' ') {
				count=count+1;
				
			}
		}
		System.out.println(count);
	}

}
