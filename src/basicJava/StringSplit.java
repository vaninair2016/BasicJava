package basicJava;

import java.util.Scanner;

public class StringSplit {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s= sc.nextLine();
		//System.out.println(s);
		String[] arr=s.split(" ",3);
		String sarr=arr.toString();
		char[] carr=sarr.toCharArray();
		
		StringBuffer news= new StringBuffer();
		int j=carr.length;
		for (int i=carr.length-1;i>0;i--) {
	
		news.append(carr[i]);
		}
		System.out.println(news.toString().valueOf(carr));
	}

}
