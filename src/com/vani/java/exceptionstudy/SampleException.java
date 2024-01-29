package com.vani.java.exceptionstudy;

import java.util.ArrayList;
import java.util.List;

public class SampleException {
	
	public void checkExcep() {
		try {
			List<Integer> i= new ArrayList<>();
			i.add(10);
			
			System.out.println("Entering try statements");
			Integer a= i.get(1);// since no value in 1st index it will throw index out of bound exception
			System.out.println("Tryna access 1st element: " + a);
		}
		catch (IndexOutOfBoundsException e) {
			System.out.println("Out of bound exception babyyy" + e.getMessage());
			throw e;
		}
		finally {
			System.out.println("This will be executed always"); 
		}
	}

}
