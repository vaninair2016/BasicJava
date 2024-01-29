package basicJava;

import java.util.Scanner;

public class CharecterDelete {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s= sc.nextLine();
		Scanner sc1= new Scanner(System.in);
		System.out.println("Enter the Charecter to be deleted from string : ");
		String c= sc1.nextLine();
		String snew = CharecterDelete.charDelete(s, c);
		System.out.println("New String is : " +snew);
		
	}

	private static String charDelete(String s, String c) {
		StringBuffer newarr= new StringBuffer();
		char c1=c.charAt(0);
		char[] arr= s.toCharArray();
		for(int i=0;i<arr.length;i++) {
			if (arr[i] !=c1) {
				newarr.append(arr[i]);
				
			}
			
		}
		return newarr.toString();
	}

}
