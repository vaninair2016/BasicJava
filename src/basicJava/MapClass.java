package basicJava;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

public class MapClass {

	public static void main(String[] args) {
		HashMap<String,Integer> sh= new HashMap<>();
		sh.put("Vani", 50);
		sh.put("Setu", 65);
		sh.put("Cuckoo", 63);
		sh.put("Revu", 40);
		sh.put("Omana", 55);
		var s= sh.entrySet();
		//System.out.println(s);
		for(Entry<String, Integer> c:s) {
			System.out.println("Key is : "+ c.getKey() + " Value  is : " +c.getValue());
		}

	}

}
