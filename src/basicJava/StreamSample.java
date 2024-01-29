package basicJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamSample {
	public static void main(String[] args) {
	List<Integer> numberList1 = new ArrayList<>();
	numberList1.add(10);
	numberList1.add(20);
	numberList1.add(30);
	numberList1.add(40);
    System.out.println(numberList1);
//    List<Integer> squareList= new ArrayList<>();
//    for(Integer i :numberList1) {
//    	
//    	squareList.add(i*i);
//	
//	}
//    System.out.println(squareList);

	//using Streams 
    
    List<Integer> squareList = numberList1.stream().map(x -> x*x).collect(Collectors.toList());
    System.out.println(squareList); 
    
    //converting one collection to another
    
    Set<Integer> squareSet = numberList1.stream().map(x -> (x*x)+1).collect(Collectors.toSet());
    System.out.println(squareSet); //[401, 1601, 101, 901]
    
    //to filter in a collection 
    
    List<String> names= new ArrayList<>();
    names.add("Setu");
    names.add("Shwetank");
    names.add("Vani");
    names.add("Amma");
    names.add("Cucoo");
//    List<String> namesS= new ArrayList<>();
//    
//    //enhanced for loop to find name which starts with S
//    for(String s : names) {
//    	if(s.startsWith("S")){
//    		namesS.add(s);
//    		
//    	}
//    }
//    
//    System.out.println(namesS);
// }
	// Streams FILTER method to find name which starts with S
	
	List<String> namesS= names.stream().filter(x -> x.startsWith("S")).collect(Collectors.toList());
	System.out.println(namesS);
	
}
}
