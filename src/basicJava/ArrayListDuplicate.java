package basicJava;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDuplicate {

    public static void main(String[] args) {

        ArrayList<String> li = new ArrayList<>();
        li.add("Vani");
        li.add("Setu");
        li.add("Cuckkoo");
        li.add("Revu");
        li.add("Setu");
        //System.out.println(li);
        ArrayList<String> li2 = new ArrayList<>();

        // Changed loop condition to iterate up to the second last element
        for (int i = 0; i < li.size(); i++) {
        	//System.out.println(li.get(i));
        	for (int j=i+1;j<li.size();j++) {
            if (li.get(i).equals(li.get(j))) {
                li2.add(li.get(i));
                //System.out.println(li.get(j));
    }
        	}
        }

        // Moved println outside the loop to print the result once
        System.out.println(li2);
    }
}

