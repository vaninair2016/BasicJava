package basicJava;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class NumberOfWords {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the sentence: ");
		String s= sc.nextLine();
		String[] words=s.split(" ");
		//List<String> li=Arrays.asList(words);
		int count=1;
		
		//HashMap<String,Integer> wordCount= new HashMap<String,Integer>();
		
		//System.out.println(li);
		for(int i=0;i<words.length;i++) {
			for(int j=i+1;j<words.length;j++) {
				if(words[i].equalsIgnoreCase(words[j])) {
					count=count+1;
					System.out.println("Duplicate words are : " +words[i] + " count " +count);
				}
			}
		}

	}

}
