package basicJava;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the String");
		String str=scanner.nextLine();
		 String strNospace= str.replaceAll(" ", "");
		
//		char[] input=strNospace.toCharArray();
//		String revStr="";
//		for (int i=input.length-1;i>=0 ; i--) {
//			revStr= revStr.concat(String.valueOf(input[i]));
//		}
		
		System.out.println("Reversed String : " +revStr);
		scanner.close();

	}
	
	public StringBuilder revwithStringBuilder(StringBuilder str){
		
		StringBuilder revStr1= new StringBuilder();
		revStr1=str;
		StringBuilder str1=revStr1.reverse();
		return str1;
		
	}

}
