package basicJava;

import java.util.ArrayList;
import java.util.List;

public class LargestNumber {

	public static void main(String[] args) {
		List<Integer> li= new ArrayList<>();
		li.add(12);
		li.add(8);
		li.add(98);
		li.add(34);
		li.add(45);
		int max=0;
		
		for(int i=0;i<li.size()-1;i++) {
			if (li.get(i)>li.get(i+1)) {
				max=li.get(i);
			}
			
			System.out.println(max);
			
		}
		
		



	}

}
